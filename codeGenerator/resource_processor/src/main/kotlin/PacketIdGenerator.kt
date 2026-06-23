import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.ksp.kspDependencies
import common.funSpecFromCallable
import org.anime_game_servers.multi_proto.core.interfaces.PacketIdProvider
import kotlin.collections.component1
import kotlin.collections.component2

data class PacketIdConfig(
    val packeIdPackage: String,
){

}

class PacketIdGeneratorNew(val config: PacketIdConfig) {

    fun createFileForMetaData(versionName: String, metaData: PacketIdResult, codeGenerator: CodeGenerator) {
        val fileSpec = generateClassForVersion(versionName, metaData)
        fileSpec.kspDependencies(false)
        codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = Dependencies(true, *metaData.dependencies.toTypedArray()),
            packageName = config.packeIdPackage,
            fileName = fileSpec.name
        )
            .writer()
            .use {
                fileSpec.writeTo(it)
            }
    }

    private fun generateClassForVersion(versionName: String, metaData: PacketIdResult) : FileSpec {
        val className = ClassName(config.packeIdPackage, versionName)

        val type = TypeSpec.classBuilder(className)
            .addSuperinterface(PacketIdProvider::class.asClassName())
            .addGetPacketId(metaData)
            .addGetPacketName(metaData)
            .build()

        return FileSpec.builder(className).apply {
            indent("    ")
            addType(type)
        }.build()
    }


    private fun TypeSpec.Builder.addGetPacketId(packeIdData: PacketIdResult) = apply {
        val mainParameterName = "packetName"
        val mainFunctionBuilder = funSpecFromCallable(PacketIdProvider::getPacketId)
            .addParameter(mainParameterName, String::class)
        val subFunctions = mutableListOf<FunSpec>()
        val mainCodeBuilder = CodeBlock.builder()
            .addStatement("val firstChar = $mainParameterName.firstOrNull()")
            .beginControlFlow("return when(firstChar)")

        packeIdData.nameIdMap.entries.groupBy { it.key.first() }.forEach { (startChar, entries) ->
            val subFunName = "getPacketId$startChar"

            mainCodeBuilder.addStatement("'$startChar' -> $subFunName($mainParameterName)")

            val parameterName = "packetName"
            val subFunctionBuilder = FunSpec.builder(subFunName)
                .addParameter(parameterName, String::class)
                .returns(Int::class)

            val subCodeBuilder = CodeBlock.builder()
                .beginControlFlow("return when ($parameterName) {")

            entries.forEach { (name, id) ->
                subCodeBuilder.addStatement("\"$name\" -> $id")
            }


            subCodeBuilder.addStatement("else -> 999999")
                .endControlFlow()

            subFunctionBuilder.addCode(subCodeBuilder.build())

            subFunctions.add(subFunctionBuilder.build())
        }

        mainCodeBuilder.addStatement("else -> 999999")
        mainCodeBuilder.endControlFlow()
        mainFunctionBuilder.addCode(mainCodeBuilder.build())

        addFunction(mainFunctionBuilder.build())
        addFunctions(subFunctions)
    }

    private fun TypeSpec.Builder.addGetPacketName(packeIdData: PacketIdResult) = apply {
        val mainParameterName = "packetId"
        val mainFunctionBuilder = funSpecFromCallable(PacketIdProvider::getPacketName)
            .addParameter(mainParameterName, Int::class)
        val subFunctions = mutableListOf<FunSpec>()
        val mainCodeBuilder = CodeBlock.builder()
            .addStatement("val baseId = $mainParameterName/1000")
            .beginControlFlow("return when(baseId)")

        packeIdData.idNameMap.entries.groupBy { it.key/1000 }.forEach { (baseId, entries) ->
            val subFunName = "getPacketName$baseId"

            mainCodeBuilder.addStatement("$baseId -> $subFunName($mainParameterName)")

            val parameterName = "packetId"
            val subFunctionBuilder = FunSpec.builder(subFunName)
                .addParameter(parameterName, Int::class)
                .returns(String::class.asClassName().copy(nullable = true))

            val subCodeBuilder = CodeBlock.builder()
                .beginControlFlow("return when ($parameterName) {")

            entries.forEach { (id, name) ->
                subCodeBuilder.addStatement("$id -> \"$name\"")
            }
            subCodeBuilder.addStatement("else -> null")
                .endControlFlow()

            subFunctionBuilder.addCode(subCodeBuilder.build())

            subFunctions.add(subFunctionBuilder.build())
        }

        mainCodeBuilder.addStatement("else -> null")
        mainCodeBuilder.endControlFlow()
        mainFunctionBuilder.addCode(mainCodeBuilder.build())

        addFunction(mainFunctionBuilder.build())
        addFunctions(subFunctions)
    }
}