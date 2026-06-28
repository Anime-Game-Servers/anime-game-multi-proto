import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.ksp.kspDependencies
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.interfaces.PacketIdProvider
import kotlin.collections.component1
import kotlin.collections.component2

class PacketIdMapperGenerator(val config: PacketIdConfig) {

    fun createFileForMetaData(versions: Map<String, PacketIdResult>, codeGenerator: CodeGenerator) {
        val fileSpec = generateClassForVersion(versions)
        codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = fileSpec.kspDependencies(true),
            packageName = config.packeIdPackage,
            fileName = fileSpec.name
        )
            .writer()
            .use {
                fileSpec.writeTo(it)
            }
    }

    private fun generateClassForVersion(versions: Map<String, PacketIdResult>) : FileSpec {
        val className = ClassName(config.packeIdPackage, "StaticPackageIds")

        val type = TypeSpec.objectBuilder(className)
            .addGetMapper(versions)
            .build()

        return FileSpec.builder(className).apply {
            indent("    ")
            addType(type)
        }.build()
    }


    private fun TypeSpec.Builder.addGetMapper(versions: Map<String, PacketIdResult>) = apply {
        val functionParam = "version"
        val mainFunctionBuilder = FunSpec.builder("getMapper")
            .addAnnotation(JvmStatic::class)
            .addParameter(functionParam, Version::class)
            .returns(PacketIdProvider::class.asClassName().copy(nullable = true))

        val mainCodeBuilder = CodeBlock.builder()
            .beginControlFlow("return when($functionParam)")

        versions.forEach { (version, _) ->
            mainCodeBuilder.addStatement("%T.$version -> $version()", Version::class)
        }

        mainCodeBuilder.addStatement("else -> null")
            .endControlFlow()
        mainFunctionBuilder.addCode(mainCodeBuilder.build())

        addFunction(mainFunctionBuilder.build())
    }


}