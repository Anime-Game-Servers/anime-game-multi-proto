import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ksp.kspDependencies
import com.squareup.kotlinpoet.ksp.originatingKSFiles
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.multi_proto.core.interfaces.ProtoEnum
import org.anime_game_servers.multi_proto.core.interfaces.ProtocolRegistry
import kotlin.collections.addAll
import kotlin.sequences.forEach

const val UNRECOGNISED_ENUM_NAME = "UNRECOGNISED"
object EnumGenerator {
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
            .addFunction(FunSpec.builder("parseBy")
                .addParameter("value", Int::class)
                .addParameter("version", Version::class)
                .addStatement("return %T.decodeEnum(version, value, ${metaData.name}::class) ?: $UNRECOGNISED_ENUM_NAME", ProtocolRegistry::class)
                .returns(className)
                .addAnnotation(JvmStatic::class)
                .build())
            .build()

        val typeBuilder = TypeSpec.enumBuilder(className)
            .addSuperinterface(
                ProtoEnum::class.asClassName())
            .addType(companion)
            .addFunction(FunSpec.builder(ProtoEnum::encode.name)
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("version", Version::class)
                .addStatement("return %T.encodeEnum(version, this, ${metaData.name}::class)", ProtocolRegistry::class)
                .returns(Int::class.asClassName().copy(nullable = true))
                .build())
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(ParameterSpec.builder("names", Set::class.parameterizedBy(String::class))
                        .build())
                    .build()
            )
            .addProperty(PropertySpec.builder("names",Set::class.parameterizedBy(String::class))
                .initializer("names")
                .build())
            .addKdoc(metaData)
            .addAnnotations(metaData.definition)

        metaData.declarations.forEach { info ->
            val name = info.simpleName.asString()

            typeBuilder.addEnumConstant(name,TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter("setOf(${info.getEnumNames().joinToString(", ") { "\"$it\"" }})")
                .addKdoc(info)
                .addAnnotations(info)
                .build())
        }

        val type = typeBuilder
            .addEnumConstant(UNRECOGNISED_ENUM_NAME, TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter("emptySet()")
                .build())
            .build()

        val file = FileSpec.builder(className).apply {
            indent("    ")
            addType(type)
        }.build()

        return file
    }

    @OptIn(KspExperimental::class)
    private fun KSClassDeclaration.getEnumNames(): List<String> {
        val names = mutableListOf(simpleName.asString())

        getAnnotationsByType(AltName::class).forEach { altname ->
            names.addAll(altname.altNames)
        }

        return names
    }
}
