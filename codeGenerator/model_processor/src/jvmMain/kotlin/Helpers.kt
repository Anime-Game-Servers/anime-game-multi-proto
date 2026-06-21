@file:OptIn(KspExperimental::class)

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSValueArgument
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.toAnnotationSpec
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.core.annotations.Converters
import java.util.Locale
import kotlin.collections.addAll
import kotlin.collections.forEach
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.sequences.forEach

/**
 * TODO cleanups
 */
fun KSPropertyDeclaration.getNames(): List<String>{
    val names = mutableListOf(simpleName.asString())
    getAnnotationsByType(AltName::class).forEach { altname ->
        names.addAll(altname.altNames)
    }

    return names
}

fun getMembers(definition: KSClassDeclaration) = mutableMapOf<String, MemberInfo>().apply {
    definition.declarations.mapNotNull { (it as? KSPropertyDeclaration)?.let { declaration ->
        if(definition.classKind == ClassKind.ENUM_CLASS && declaration.simpleName.asString() == "entries"){
            null
        } else declaration
    } }
        .associateByTo(this, { it.simpleName.asString().lowercase() },
            { property ->
                MemberInfo(property, property.simpleName.asString(), property.getNames(), property.type.resolve(), property.isPropertyInConstructor(definition), property.getConverters())
            })
}


fun KSPropertyDeclaration.isPropertyInConstructor(classDec: KSClassDeclaration): Boolean {
    if(classDec.classKind == ClassKind.INTERFACE){
        return true
    }

    val primaryConstructor = classDec.primaryConstructor ?: return false
    val names = this.getNames()
    val constructorParameters = primaryConstructor.parameters.filter { it.name?.asString() in names }
    return constructorParameters.isNotEmpty()
}
fun KSPropertyDeclaration.getConverters(): List<TypeConverter>{
    return annotations.filter { it.isType(Converters::class)}
        .flatMap { it.arguments.flatMap { args ->
            @Suppress("UNCHECKED_CAST")
            args.value as ArrayList<KSType>
        } }
        .map { TypeConverter(it) }.toList()
}
fun KSAnnotation.getParentClass() = arguments.firstOrNull { it.name?.asString() == "parentClass" }?.value?.toString()
fun KSAnnotation.getAltNames() = (arguments.firstOrNull { it.name?.asString() == "alternativeNames" }?.value) as? List<String>

fun String.getProtoName(parameterName: String?) = parameterName?.let { if(it.isBlank()) this else "$it.$this" } ?: this

fun KSDeclaration.getFullClassName() : String{
    parentDeclaration?.let {
        return it.getFullClassName()+"."+simpleName.asString()
    }
    return packageName.asString()+"."+simpleName.asString()
}
fun KSType.getFullClassName() : String{
    return declaration.getFullClassName()
}
fun KSType.getParentType() : String?{
    return declaration.getParentType();
}
fun KSDeclaration.getParentType() : String?{
    return parentDeclaration?.simpleName?.asString() ?: run {
        try {
            getAnnotationsByType(ProtoModel::class).firstOrNull()?.let { protoModel ->
                return protoModel.parentClass
            }
            getAnnotationsByType(ProtoEnum::class).firstOrNull()?.let { protoModel ->
                return protoModel.parentClass
            }
        }catch (ex: Exception){}
        null
    }
}

data class ClassInfo(
    val name: String,
    val packageName: String,
    val definition: KSClassDeclaration,
    val dependencies: Set<KSFile>,
    val originalPackage: String = definition.packageName.asString(),
    val modelMembers: Map<String, MemberInfo> = getMembers(definition),
    val oneOfs: Map<String, OneOfData> = modelMembers.filterValues { it.type.declaration.simpleName.asString() == "OneOfType" }
        .entries.associate {
            it.key to OneOfData.createOneOfData(definition, it.value.type, it.value.name)
        },
    val declarations: List<KSClassDeclaration> = definition.declarations.mapNotNull { it as? KSClassDeclaration }.toList(),
    val names: Set<String> = setOf(name)
)


data class MemberInfo(
    val property : KSPropertyDeclaration,
    val name: String, val names: List<String>, val type: KSType, val isPrimaryConstructorMember: Boolean = false, val converters: List<TypeConverter>,
    val parentType: String? = type.getParentType()){
}

data class OneOfType(
    val name: String,
    val kSType: KSType,
    val altNames : List<String>,
)

fun KSClassDeclaration.getProtoAnnotation() = annotations.firstOrNull { it.shortName.asString().startsWith("Proto") }
fun String.capitalizeFirstLetter() :String{
    return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

data class OneOfData(
    val type: KSType,
    val variableName: String,
    val oneOfTypes: Set<OneOfType>,
    val oneOfClassMap: Map<String, OneOfType>,
    val allowTypeBasedMapping: Boolean = false,
    val wrapperName: String = variableName.capitalizeFirstLetter(),
    val unknownName: String = "Unknown"+variableName.capitalizeFirstLetter()
) {
    companion object {
        fun createOneOfData(definition: KSClassDeclaration, type: KSType, variableName: String) : OneOfData {
            val oneOfClasses = mutableSetOf<OneOfType>()
            // TODO OneOfEntry handling with name mapping
            val oneOfClassMap = mutableMapOf<String, OneOfType>()
            var allowTypeBasedMapping = false
            definition.declarations.forEach declarations@{ declaration ->
                if (declaration.simpleName.asString() != variableName) return@declarations
                declaration.annotations.forEach { ksAnnotation ->
                    if (ksAnnotation.isType(OneOf::class)) {
                        ksAnnotation.arguments.forEach { ksArgument ->
                            if (ksArgument.isField(OneOf::types)) {
                                val values = (ksArgument.value as? ArrayList<KSAnnotation>) ?: return@forEach
                                values.forEach { oneOfEntry ->
                                    val names = mutableListOf<String>()
                                    var type: KSType? = null
                                    var mainName: String? = null
                                    oneOfEntry.arguments.forEach { oneOfEntryArgument ->
                                        when(oneOfEntryArgument.name?.asString()){
                                            OneOfEntry::type.name ->
                                                type = oneOfEntryArgument.value as? KSType
                                            OneOfEntry::name.name ->
                                                (oneOfEntryArgument.value as? ArrayList<String>)?.let { altnames ->
                                                    names.addAll(altnames)
                                                    mainName = altnames.first()
                                                }
                                        }
                                    }
                                    type ?: return@forEach
                                    mainName ?: return@forEach
                                    val typeDef = OneOfType(name =  mainName, kSType =  type,
                                        altNames = if(names.size < 2) emptyList() else names.subList(1, names.size))
                                    oneOfClasses.add(typeDef)
                                    names.forEach { name ->
                                        oneOfClassMap[name] = typeDef
                                    }
                                }
                            }
                            if (ksArgument.name?.asString() == OneOf::allowTypedBasedMapping.name) {
                                allowTypeBasedMapping = ksArgument.value as Boolean
                            }
                        }
                    }
                }
            }
            return OneOfData(type, variableName, oneOfClasses, oneOfClassMap, allowTypeBasedMapping)
        }
    }
}

class TypeConverter(val type: KSType){
    val inType: KSType
    val outType: KSType
    val inTypeString: String
    val outTypeString: String
    init {
        val typeArgs = type.declaration.annotations.firstOrNull()?.arguments ?: throw RuntimeException("Missing Converter type for $type")
        inType = typeArgs.first().value as KSType
        outType = typeArgs.getOrNull(1)?.value as KSType
        inTypeString = inType.declaration.simpleName.asString()
        outTypeString = outType.declaration.simpleName.asString()
    }
    fun getFullConverterClassName():String{
        return type.getFullClassName()
    }
}


// type check helpers
inline fun <reified T : Annotation>  KSAnnotation.isType(type: KClass<T>) =
    shortName.asString() == type.simpleName
fun KSValueArgument.isField(type: KProperty1<*,*>) =
    name?.asString() == type.name
fun KSType.isType(type: KClass<*>) =
    declaration.simpleName.asString() == type.simpleName


// kdoc handling
// TODO handle or replace references
fun TypeSpec.Builder.addKdoc(classInfo: ClassInfo) = apply {
    addKdoc(classInfo.definition)
}
fun TypeSpec.Builder.addKdoc(declaration: KSClassDeclaration) = apply {
    declaration.docString?.let { docs ->
        addKdoc("%L", docs.trim())
    }
}
fun PropertySpec.Builder.addKdoc(memberInfo: MemberInfo) = apply {
    memberInfo.property.docString?.let { docs ->
        addKdoc("%L", docs.trim())
    }
}

// Annotations
fun TypeSpec.Builder.addAnnotations(classInfo: ClassInfo) = apply {
    addAnnotations(classInfo.definition)
}
fun TypeSpec.Builder.addAnnotations(declaration: KSClassDeclaration) = apply {
    val classAnnotations = declaration.annotations.mapNotNull { annotation ->
        if(annotation.isType(ProtoModel::class) || annotation.isType(ProtoCommand::class) || annotation.isType(ProtoEnum::class))
            return@mapNotNull null
        annotation.toAnnotationSpec()
    }.toList()
    if (classAnnotations.isNotEmpty()){
        addAnnotations(classAnnotations)
    }
}
fun PropertySpec.Builder.addAnnotations(memberInfo: MemberInfo) = apply {
    val memberAnnotations = memberInfo.property.annotations.mapNotNull { annotation ->
        if(annotation.isType(OneOf::class)) return@mapNotNull null
        annotation.toAnnotationSpec()
    }.toList()
    if (memberAnnotations.isNotEmpty()){
        addAnnotations(memberAnnotations)
    }
}