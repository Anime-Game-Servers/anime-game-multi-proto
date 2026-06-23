import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class ResourceProcessorProvider(): SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): ResourceProcessor {
        return ResourceProcessor(environment.codeGenerator, environment.logger, environment.options)
    }
}