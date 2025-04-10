import processor.common.Generator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import java.io.OutputStream
import java.util.*

//TODO keep AddedIn/RemovedIn annotations
abstract class BaseGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>,
): Generator(logger, resolver, classInfoCache) {
    override fun createClassForProto(file: OutputStream, classInfo:ClassInfo) {
        file += "package ${classInfo.packageName}\n"
        addImports(file, classInfo)
        addConstructor(file, classInfo)
        addBody(file, classInfo)
        addEncodeMethods(file, classInfo)
        addCompanionObject(file, classInfo)
        addClosure(file, classInfo)
        file.close()
    }

    open fun addImports(file:OutputStream, classInfo: ClassInfo){
        file += "import ${Version::class.java.canonicalName}\n"+
                "import ${AddedIn::class.java.canonicalName}\n"+
                "import ${RemovedIn::class.java.canonicalName}\n"+
                "import org.anime_game_servers.multi_proto.gi.utils.ProtoVersionManager\n"+
                "import kotlin.jvm.JvmStatic\n"+
                "import kotlin.jvm.JvmOverloads\n"
    }

    open fun addConstructor(file:OutputStream, classInfo:ClassInfo){
        //add the kdoc if it exists //TODO
        classInfo.definition.docString?.let {
            file += "/**${it.replace("\n","\n  * ")}*/\n"
        }
    }
    open fun addBody(file:OutputStream, classInfo:ClassInfo){

    }

    open fun addEncodeMethods(file:OutputStream, classInfo: ClassInfo){

    }

    open fun addParsingMethods(file:OutputStream, classInfo:ClassInfo){
    }

    open fun addCompanionObject(file: OutputStream, classInfo:ClassInfo){

        file.id(4) +="companion object {\n"
        addParsingMethods(file, classInfo)
        file.id(4) += "}\n"
    }

    open fun addClosure(file: OutputStream, classInfo: ClassInfo) {}


    protected fun String.getVariableName():String{
        return this.snakeToLowerCamelCase().replaceFirstChar { it.lowercaseChar() }
    }
    protected fun String.getClassName():String{
        return this.snakeToLowerCamelCase().replaceFirstChar { it.uppercaseChar() }
    }

    protected fun OutputStream.id(indentation: Int): OutputStream {
        this += " ".repeat(indentation)
        return this
    }

    operator fun OutputStream.plusAssign(str: String) {
        this.write(str.toByteArray())
    }

    companion object {
        val snakeRegex = "_[a-zA-Z]".toRegex()
        fun String.snakeToLowerCamelCase(): String {
            return snakeRegex.replace(this) {
                it.value.replace("_","")
                    .uppercase()
            }
        }
    }
}