import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSType

/**
 * TODO CommandId handling
 */
class CommandGenerator(logger: KSPLogger, resolver: Resolver, classInfoCache: MutableMap<KSType, ClassInfo>) :
    DataGenerator(logger, resolver, classInfoCache) {
}