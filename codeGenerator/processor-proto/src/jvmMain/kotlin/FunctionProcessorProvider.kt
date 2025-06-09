import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class FunctionProcessorProvider(): SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): FunctionProcessor {
        return FunctionProcessor(environment.codeGenerator, environment.logger, environment.options)
    }
}