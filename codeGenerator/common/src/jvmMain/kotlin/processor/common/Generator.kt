package processor.common

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import java.io.OutputStream
import kotlin.collections.get

@OptIn(KspExperimental::class)
abstract class Generator(
    val logger: KSPLogger,
    val resolver: Resolver,
    val classInfoCache: MutableMap<KSType, ClassInfo>,
) {
    val enumType = resolver.getKotlinClassByName("kotlin.Enum")
    val mapClass = resolver.getKotlinClassByName("kotlin.collections.Map.Entry")
    val protoEnumType = resolver.getKotlinClassByName("pbandk.Message.Enum")

    data class ClassInfo(
        val name: String,
        val packageName: String,
        val definition: KSClassDeclaration,
        val dependencies: Set<KSFile>,
        val protoSet: Set<ProtoData>,
        val isProtoModel: Boolean,
        val originalPackage: String = definition.packageName.asString(),
        val modelMembers: Map<String, MemberInfo> = getMembers(definition),
        val oneOfs: Map<String, OneOfData> = modelMembers.filterValues { it.type.declaration.simpleName.asString() == "OneOfType" }
            .entries.associate {
                it.key to OneOfData.createOneOfData(definition, it.value.type, it.value.name)
            },
        val declarations: List<KSClassDeclaration> = definition.declarations.mapNotNull { it as? KSClassDeclaration }
            .toList(),
        val names: Set<String> = setOf(name)
    )

    data class ProtoData(
        val classDeclaration: KSClassDeclaration,
        val packageName: String = classDeclaration.packageName.asString(),
        val protoPackageName: String = packageName,
        val className: String = classDeclaration.simpleName.asString(),
        val absoluteClassName: String = "$packageName.$className",
        val versionPackage: String = protoPackageName.split('.').last(),
        val parseFunctionName: String = "parseBy$versionPackage",
        val encodeFunctionName: String = "encodeTo$versionPackage",
        val members: Map<String, MemberInfo> = getMembers(classDeclaration)
    )

    data class MemberInfo(
        val name: String,
        val names: List<String>,
        val type: KSType,
        val isPrimaryConstructorMember: Boolean = false,
        val converters: List<TypeConverter>
    ) {
        fun hasSameName(other: MemberInfo): Boolean {
            return names.any { name -> other.names.any { it.equals(name, ignoreCase = true) } }
        }
    }

    data class OneOfData(
        val type: KSType,
        val variableName: String,
        val oneOfClassMap: Map<List<String>, KSType>,
        val allowTypeBasedMapping: Boolean = false,
        val wrapperName: String = variableName.capitalizeFirstLetter(),
        val unknownName: String = "Unknown" + variableName.capitalizeFirstLetter()
    ) {
        companion object {
            fun String.capitalizeFirstLetter(): String {
                return replaceFirstChar { if (it.isLowerCase()) it.titlecase(java.util.Locale.getDefault()) else it.toString() }
            }

            fun createOneOfData(
                definition: KSClassDeclaration,
                type: KSType,
                variableName: String
            ): OneOfData {
                // TODO OneOfEntry handling with name mapping
                val oneOfClassMap = mutableMapOf<List<String>, KSType>()
                var allowTypeBasedMapping = false
                definition.declarations.forEach declarations@{ declaration ->
                    if (declaration.simpleName.asString() != variableName) return@declarations
                    declaration.annotations.forEach { ksAnnotation ->
                        if (ksAnnotation.shortName.asString() == "OneOf") {
                            ksAnnotation.arguments.forEach { ksArgument ->
                                if (ksArgument.name?.asString() == "types") {
                                    val values =
                                        (ksArgument.value as? ArrayList<KSAnnotation>)
                                            ?: return@forEach
                                    values.forEach { oneOfEntry ->
                                        val names = mutableListOf<String>()
                                        var type: KSType? = null
                                        oneOfEntry.arguments.forEach { oneOfEntryArgument ->
                                            if (oneOfEntryArgument.name?.asString() == "type") {
                                                type =
                                                    oneOfEntryArgument.value as? KSType
                                                        ?: return@forEach
                                            }
                                            if (oneOfEntryArgument.name?.asString() == "name") {
                                                names.addAll(
                                                    oneOfEntryArgument.value as? ArrayList<String> ?: return@forEach
                                                )
                                            }
                                        }
                                        type?.let { oneOfClassMap[names] = it }
                                    }
                                }
                                if (ksArgument.name?.asString() == "allowTypeBasedMapping") {
                                    allowTypeBasedMapping = ksArgument.value as Boolean
                                }
                            }
                        }
                    }
                }
                return OneOfData(type, variableName, oneOfClassMap, allowTypeBasedMapping)
            }
        }
    }

    protected fun getFullNameForTarget(targetType: MemberInfo, fallback: String, sourceType: MemberInfo?): String {
        return classInfoCache[sourceType?.type]?.let {
            it.packageName + "." + it.name
        } ?: fallback
    }

    protected fun getTypeString(variable: Map.Entry<String, MemberInfo>): String {
        val type = variable.value.type
        /*return when (val typeString = getFullNameForTarget(type, type.declaration.simpleName.asString(), type)) {
            "List" -> {
                val typeArg = type.arguments.first().type?.resolve()
                val typeArgString = typeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val classInfoCache = classInfoCache[it]
                    val typePackage = classInfoCache?.packageName?.let { "$it." } ?: ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "List<$typeArgString>"
            }
            "Map" -> {
                val keyTypeArg = type.arguments.first().type?.resolve()
                val keyTypeArgString = keyTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                val valueTypeArg = type.arguments.getOrNull(1)?.type?.resolve()
                val valueTypeArgString = valueTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "Map<$keyTypeArgString, $valueTypeArgString>"
            }
            "OneOfType"-> {
                "${variable.key.capitalizeFirstLetter()}<*>"
            }
            else -> typeString
        }*/
        val typeEnum = Type.byType(type, this)
        val typeString = getFullNameForTarget(variable.value, type.declaration.simpleName.asString(), variable.value)
        return when (typeEnum) {
            Type.COLLECTION -> {
                val typeArg = type.arguments.first().type?.resolve()
                val typeArgString = typeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val classInfoCache = classInfoCache[it]
                    val typePackage = classInfoCache?.packageName?.let { "$it." } ?: ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "List<$typeArgString>"
            }

            Type.MAP -> {
                val keyTypeArg = type.arguments.first().type?.resolve()
                val keyTypeArgString = keyTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                val valueTypeArg = type.arguments.getOrNull(1)?.type?.resolve()
                val valueTypeArgString = valueTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "Map<$keyTypeArgString, $valueTypeArgString>"
            }

            Type.ONE_OF -> {
                "${variable.value.name.capitalizeFirstLetter()}<*>?"
            }

            Type.DATA -> {
                "$typeString?"
            }

            else -> typeString
        }
    }

    enum class Type {
        SIMPLE,
        BYTE_ARRAY,
        COLLECTION,
        MAP,
        MAP_ENTRY,
        ENUM,
        ONE_OF,
        DATA;

        companion object {
            fun byType(type: KSType, generator: Generator): Type {
                val string = type.declaration.simpleName.asString()
                return when (string) {
                    "Byte" -> SIMPLE
                    "Short" -> SIMPLE
                    "Int" -> SIMPLE
                    "UInt" -> SIMPLE
                    "Long" -> SIMPLE
                    "Float" -> SIMPLE
                    "Double" -> SIMPLE
                    "Char" -> SIMPLE
                    "String" -> SIMPLE
                    "Boolean" -> SIMPLE
                    "ByteArray" -> BYTE_ARRAY
                    "ByteArr" -> BYTE_ARRAY
                    "List" -> COLLECTION
                    "Set" -> COLLECTION
                    "Map" -> MAP
                    "OneOfType" -> ONE_OF
                    else -> {
                        if (generator.enumType?.asStarProjectedType()
                                ?.isAssignableFrom(type) == true || generator.protoEnumType?.asStarProjectedType()
                                ?.isAssignableFrom(type) == true
                        ) {
                            ENUM
                        } else if (generator.mapClass?.asStarProjectedType()?.isAssignableFrom(type) == true) {
                            MAP_ENTRY
                        } else {
                            DATA
                        }
                    }
                }
            }
        }
    }

    class TypeConverter(val type: KSType) {
        val inType: KSType
        val outType: KSType
        val inTypeString: String
        val outTypeString: String

        init {
            val typeArgs = type.declaration.annotations.first().arguments
            inType = typeArgs.first().value as KSType
            outType = typeArgs.getOrNull(1)?.value as KSType
            inTypeString = inType.declaration.simpleName.asString()
            outTypeString = outType.declaration.simpleName.asString()
        }

        fun getFullConverterClassName(): String {
            return type.getFullClassName()
        }
    }

    companion object {
        const val UNRECOGNISED_ENUM_NAME = "UNRECOGNISED"

        fun KSType.getFullClassName(): String {
            return declaration.getFullClassName()
        }

        fun KSDeclaration.getFullClassName(): String {
            parentDeclaration?.let {
                return it.getFullClassName() + "." + simpleName.asString()
            }
            return packageName.asString() + "." + simpleName.asString()
        }

        fun KSPropertyDeclaration.getNames(): List<String> {
            val names = mutableListOf(simpleName.asString())
            annotations.filter { annotation -> annotation.shortName.asString() == "AltName" }
                .forEach { it.arguments.forEach { (it.value as? List<String>)?.let { names.addAll(it) } } }

            return names
        }

        fun KSPropertyDeclaration.isPropertyInConstructor(classDec: KSClassDeclaration): Boolean {
            if (classDec.classKind == ClassKind.INTERFACE) {
                return true
            }

            val primaryConstructor = classDec.primaryConstructor ?: return false
            val names = this.getNames()
            val constructorParameters = primaryConstructor.parameters.filter { it.name?.asString() in names }
            return constructorParameters.isNotEmpty()
        }

        fun KSPropertyDeclaration.getConverters(): List<TypeConverter> {
            return annotations.filter { it.shortName.asString() == "Converters" }
                .flatMap { it.arguments.flatMap { args -> args.value as ArrayList<KSType> } }
                .map { TypeConverter(it) }.toList()
        }

        fun String.capitalizeFirstLetter(): String {
            return replaceFirstChar { if (it.isLowerCase()) it.titlecase(java.util.Locale.getDefault()) else it.toString() }
        }

        fun getMembers(definition: KSClassDeclaration) =
            mutableMapOf<String, MemberInfo>().apply {
                definition.declarations.filter { it is KSPropertyDeclaration }
                    .associateByTo(
                        this, { it.simpleName.asString().lowercase() },
                        {
                            (it as KSPropertyDeclaration).let { property ->
                                MemberInfo(
                                    property.simpleName.asString(),
                                    property.getNames(),
                                    property.type.resolve(),
                                    property.isPropertyInConstructor(definition),
                                    it.getConverters()
                                )
                            }
                        })
            }
    }

    fun MemberInfo.getDefaultValueForType(oneOfData: OneOfData? = null): String {
        val typeString = this.type.declaration.simpleName.asString()
        return when (typeString) {
            "Int" -> "0"
            "UInt" -> "0"
            "Long" -> "0L"
            "Float" -> "0.0f"
            "Double" -> "0.0"
            "String" -> "\"\""
            "Boolean" -> "false"
            "List" -> "emptyList()"
            "Map" -> "emptyMap()"
            "ByteArray" -> "ByteArray(0)"
            "OneOfType" -> {
                "null"
                /*oneOfData?.let {
                    "${it.wrapperName}.${it.unknownName}()"
                } ?: run {
                    logger.warn("no one of data for type $typeString")
                    "typeString()"
                }*/
            }

            else -> {

                val fullName = getFullNameForTarget(this, typeString, this)
                if (enumType?.asStarProjectedType()?.isAssignableFrom(this.type) == true) {
                    "$fullName.$UNRECOGNISED_ENUM_NAME"
                } else {
                    //"$fullName()"
                    "null"
                }
            }
        }
    }

    abstract fun createClassForProto(file: OutputStream, classInfo:ClassInfo)
}