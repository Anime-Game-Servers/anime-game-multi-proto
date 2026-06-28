@file:OptIn(KspExperimental::class, ExperimentalKotlinPoetApi::class)

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ksp.kspDependencies
import com.squareup.kotlinpoet.ksp.originatingKSFiles
import com.squareup.kotlinpoet.ksp.toClassName
import common.BASE_PACKET_KEY
import common.DATA_PACKAGE_SUFFIX
import common.GENERATED_PACKAGE_SUFFIX
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.core.interfaces.ProtoModel
import org.anime_game_servers.multi_proto.core.interfaces.ProtoModelCompanion
import org.anime_game_servers.multi_proto.core.interfaces.ProtocolRegistry
import java.security.InvalidParameterException
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.plus
import kotlin.reflect.KClass

data class GeneratorOptions(
    val modelsNullableByDefault: Boolean = true,
    val baseDataPacket: String
) {
    constructor(kspOptions: Map<String, String>): this(baseDataPacket = kspOptions[BASE_PACKET_KEY]!!+".$DATA_PACKAGE_SUFFIX")
}

/**
 * TODOs
 * copy code commentaries
 */
class ModelGenerator(
    val logger: KSPLogger,
    val resolver: Resolver,
    val classInfoCache: MutableMap<KSType, ClassInfo>,
    val options: GeneratorOptions,
) {
    val enumType = resolver.getKotlinClassByName("kotlin.Enum")
    fun createFileForMetaData(metaData: ClassInfo, codeGenerator: CodeGenerator) {
        val fileSpec = generateClassForMetaData(metaData)
        val dependencies = fileSpec.kspDependencies(false, originatingKSFiles = fileSpec.originatingKSFiles() + metaData.dependencies)
        codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = dependencies,
            packageName = metaData.packageName,
            fileName = fileSpec.name
        )
            .writer()
            .use {
                fileSpec.writeTo(it)
            }
    }

    fun generateClassForMetaData(metaData: ClassInfo) : FileSpec {
        val className = ClassName(metaData.packageName, metaData.name)

        val companion = TypeSpec.companionObjectBuilder()
            .addSuperinterface(ProtoModelCompanion::class.asClassName().parameterizedBy(className))
            .addFunction(FunSpec.builder(ProtoModelCompanion<*>::parseBy.name)
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("data", ByteArray::class)
                .addParameter("version", Version::class)
                .addStatement("return %T.decodeFromByteArray(version, data, ${metaData.name}::class) ?: ${metaData.name}()", ProtocolRegistry::class)
                .returns(className)
                .addAnnotation(JvmStatic::class)
                .build())
            .build()

        val typeBuilder = TypeSpec.classBuilder(className)
            .addSuperinterface(ProtoModel::class.asClassName())
            .addType(companion)
            .addFunction(FunSpec.builder(ProtoModel::encodeToByteArray.name)
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("version", Version::class)
                .addStatement("return %T.encodeToByteArray(version, this, ${metaData.name}::class)", ProtocolRegistry::class)
                .returns(ByteArray::class.asClassName().copy(nullable = true))
                .build())
            .addKdoc(metaData)
            .addAnnotations(metaData)

        val constructor = FunSpec.constructorBuilder()
            .addAnnotation(JvmOverloads::class)
        if(metaData.modelMembers.isNotEmpty()) {
            typeBuilder.addModifiers(KModifier.DATA)

            metaData.modelMembers.forEach { (_, info) ->
                val name = info.name
                val type = if(info.type.isType(OneOfType::class)){
                    val oneOfData = metaData.oneOfs[info.name.lowercase()] ?: run {
                        logger.warn("No oneOf for ${info.name}")
                        return@forEach
                    }
                    val oneOffType = generateOneOfsForMember(className, typeBuilder, oneOfData)
                    typeBuilder.addType(oneOffType)
                    className.nestedClass(oneOffType.name!!.snakeToLowerCamelCase())
                        .parameterizedBy(STAR)
                        .copy(nullable = true)
                } else {
                    try {
                        getClassType(info.type)
                    } catch (e: Exception) {
                        logger.warn("Failed to get Class type for ${info.name}: ${e.message}")
                        return@forEach
                    }
                }
                constructor.addParameter(
                    ParameterSpec.builder(name, type)
                        .defaultValue(getDefaultValue(info))
                        .build()
                )
                typeBuilder.addProperty(
                    PropertySpec.builder(name, type)
                        .mutable(true)
                        .initializer(name)
                        .addAnnotations(info)
                        .addKdoc(info)
                        .build()
                )
            }
        }

        addUnknownFieldsMap(constructor, typeBuilder)
        typeBuilder.primaryConstructor(constructor.build())

        val file = FileSpec.builder(className).apply {
            indent("    ")
            addType(typeBuilder.build())
        }.build()

        return file
    }
    fun addUnknownFieldsMap(constructor: FunSpec.Builder, typeBuilder: TypeSpec.Builder){
        val unknownFieldsName = ProtoModel::unknownFields.name
        val unknownFieldsType = Map::class.asClassName().parameterizedBy(Int::class.asClassName(), Any::class.asClassName())
        constructor.addParameter(
            ParameterSpec.builder(name = unknownFieldsName, type = unknownFieldsType)
                .defaultValue("emptyMap()")
                .build()
        )
        typeBuilder.addProperty(PropertySpec.builder(name = unknownFieldsName, type = unknownFieldsType, KModifier.OVERRIDE)
            .mutable(true)
            .initializer(unknownFieldsName)
            .build()
        )
    }

    fun generateOneOfsForMember(parentType: ClassName, containingClassBuilder: TypeSpec.Builder, oneOfData: OneOfData) : TypeSpec{
        val sealedClassName = parentType.nestedClass(oneOfData.wrapperName)
        val classGeneric = TypeVariableName("T")
        val valueName = "value"

        // generate sealed base class for oneof wrapper classes
        val parentTypePrimaryConstructor = FunSpec.constructorBuilder()
            .addParameter(valueName, classGeneric)
        val parentTypeBuilder = TypeSpec.classBuilder(sealedClassName)
            .addSuperinterface(ProtoModel::class.asClassName())
            .addModifiers(KModifier.SEALED)
            .addTypeVariable(classGeneric)
            .addProperty(PropertySpec.builder(valueName, classGeneric)
                .initializer(valueName)
                .build()
            )
            .addFunction(FunSpec.builder(ProtoModel::encodeToByteArray.name)
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("version", Version::class)
                .addCode(CodeBlock.builder()
                    .beginControlFlow("return when(value)")
                        .addStatement("is %T -> value.encodeToByteArray(version)", ProtoModel::class)
                        .addStatement("else -> null")
                        .endControlFlow()
                    .build()
                )
                .returns(ByteArray::class.asClassName().copy(nullable = true))
                .build()
            )

        addUnknownFieldsMap(parentTypePrimaryConstructor, parentTypeBuilder)

        // add wrapper and type for unknown oneof type
        val unknownModelName = sealedClassName.nestedClass("UnknownModel")
        val unknownTypeName = sealedClassName.nestedClass(oneOfData.unknownName)
        val unknownModel = TypeSpec.classBuilder(unknownModelName)
            .addSuperinterface(ProtoModel::class.asClassName())
            .addFunction(FunSpec.builder(ProtoModel::encodeToByteArray.name)
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("version", Version::class)
                .addStatement("return null")
                .returns(ByteArray::class.asClassName().copy(nullable = true))
                .build())
        val unknownModelConstructor = FunSpec.constructorBuilder()
        addUnknownFieldsMap(unknownModelConstructor, unknownModel)
        unknownModel.primaryConstructor(unknownModelConstructor.build())

        val unknownType = TypeSpec.classBuilder(unknownTypeName)
            .superclass(sealedClassName.parameterizedBy(unknownModelName))
            .addSuperclassConstructorParameter(CodeBlock.builder().add("UnknownModel()").build())
            .primaryConstructor(FunSpec.constructorBuilder().build())
            .build()

        parentTypeBuilder.addType(unknownType)
            .addType(unknownModel.build())
            .primaryConstructor(parentTypePrimaryConstructor.build())

        val oneOfClasses = oneOfData.oneOfTypes.associateWith { classInfoCache[it.kSType]  }
        oneOfClasses.forEach { (oneOfInfo, oneOfClass) ->
            oneOfClass ?: return@forEach
            val className = sealedClassName.nestedClass(
                if(oneOfData.allowTypeBasedMapping) oneOfClass.name else oneOfInfo.name.getClassName()
            )
            // Build wrapper class for Oneof type
            val oneOfType = ClassName(oneOfClass.packageName,oneOfClass.name)
            parentTypeBuilder.addType(TypeSpec.classBuilder(className)
                .superclass(sealedClassName.parameterizedBy(oneOfType))
                .primaryConstructor(FunSpec.constructorBuilder()
                    .addParameter("value", oneOfType)
                    .build())
                .addSuperclassConstructorParameter(CodeBlock.builder().add("value").build())
                .addOneOfAnnotations(oneOfInfo)
                .build()
            )

            // Add convenience accessors for oneof fields
            containingClassBuilder.addProperty(
                PropertySpec.builder(oneOfInfo.name.snakeToLowerCamelCase(), oneOfType.copy(nullable = true))
                    .mutable(true)
                    .setter(FunSpec.setterBuilder()
                        .addParameter("value", oneOfType)
                        .addStatement("this.${oneOfData.variableName} = value?.let { %T(it) }", className)
                        .build()
                    )
                    .getter(FunSpec.getterBuilder()
                        .addStatement("return (${oneOfData.variableName} as? %T)?.value", className)
                        .build()
                    )
                    .addOneOfAnnotations(oneOfInfo)
                    .build())
        }

        return parentTypeBuilder
            .build()
    }

    private fun Version.toAnnotationSpec(type: KClass<out Annotation>) = AnnotationSpec.builder(type)
        .addMember("version = %L", this)
        .build()

    fun PropertySpec.Builder.addOneOfAnnotations(oneOfType: OneOfType) = apply {
        oneOfType.addedVersion?.let { addedVersion ->
            addAnnotation(addedVersion.toAnnotationSpec(AddedIn::class))
        }
        oneOfType.removedVersion?.let { removedVersion ->
            addAnnotation(removedVersion.toAnnotationSpec(RemovedIn::class))
        }
    }

    fun TypeSpec.Builder.addOneOfAnnotations(oneOfType: OneOfType) = apply {
        oneOfType.addedVersion?.let { addedVersion ->
            addAnnotation(addedVersion.toAnnotationSpec(AddedIn::class))
        }
        oneOfType.removedVersion?.let { removedVersion ->
            addAnnotation(removedVersion.toAnnotationSpec(RemovedIn::class))
        }
    }


    context(typeString: String)
    fun KSType.getResolvedType(index: Int = 0) = arguments.getOrNull(index)?.type?.resolve()
        ?: throw InvalidParameterException("No argument for parameter $index of $typeString")

    fun getClassType(type: KSType): TypeName {
        val typeString = type.declaration.simpleName.asString()
        return context(typeString) {
            when(typeString){
                "List" -> {
                    val parameter = getClassType(type.getResolvedType())
                    List::class.asClassName().parameterizedBy(parameter)
                }
                "Set" -> {
                    val parameter = getClassType(type.getResolvedType())
                    Set::class.asClassName().parameterizedBy(parameter)
                }
                "Map" -> {
                    val firstParam =  getClassType(type.getResolvedType(0))
                    val secondParam = getClassType(type.getResolvedType(1))
                    Map::class.asClassName().parameterizedBy(firstParam, secondParam)
                }
                else -> {
                    val declaration = type.declaration
                    val packageName = declaration.packageName.asString()
                    val shouldBeNullable = !packageName.startsWith("kotlin") && (options.modelsNullableByDefault || type.isMarkedNullable)
                    if(packageName.startsWith(options.baseDataPacket)){
                        ClassName(packageName.replaceFirst("$DATA_PACKAGE_SUFFIX.","$GENERATED_PACKAGE_SUFFIX."), declaration.simpleName.asString())
                    } else {
                        type.toClassName()
                    }.copy(nullable = shouldBeNullable)
                }
            }
        }
    }
    fun getDefaultValue(member: MemberInfo): String {
        val type = member.type
        val typeString = type.declaration.simpleName.asString()
        return when(typeString){
            "List", "Set" -> "[]"
            "Map" -> "emptyMap()"
            "Int", "UInt" -> "0"
            "Long" -> "0L"
            "Float" -> "0.0f"
            "Double" -> "0.0"
            "String" -> "\"\""
            "Boolean" -> "false"
            "ByteArray" -> "ByteArray(0)"
            "OneOfType" -> {
                "null"
            }
            else -> {
                if(enumType?.asStarProjectedType()?.isAssignableFrom(type) == true){
                    "$UNRECOGNISED_ENUM_NAME"
                }else {
                    "null"
                }
            }
        }
    }


    val snakeRegex = "_[a-zA-Z]".toRegex()
    fun String.snakeToLowerCamelCase(): String {
        return snakeRegex.replace(this) {
            it.value.replace("_","")
                .uppercase()
        }
    }

    private fun String.getClassName():String{
        return this.snakeToLowerCamelCase().replaceFirstChar { it.uppercaseChar() }
    }
}
