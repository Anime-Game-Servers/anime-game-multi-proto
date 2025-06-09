package org.anime_game_servers.multi_proto.gi.utils

import io.github.oshai.kotlinlogging.KLogger
import io.github.oshai.kotlinlogging.KotlinLogging
import org.anime_game_servers.multi_proto.gi.interfaces.*
import java.lang.invoke.*
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.net.URLClassLoader
import java.io.File

actual object ProtoVersionManager {
    private const val MESSAGE_CLASS_PREFIX = "org.anime_game_servers.multi_proto.gi.messages."
    private const val PROTO_CLASS_PREFIX = "org.anime_game_servers.multi_proto.proto."

    private var logger: KLogger? = KotlinLogging.logger {}
    private val classLoaders = ConcurrentHashMap<String, VersionedClassLoader>()
    private val methodLookup = MethodHandles.lookup();

    private val encodeMethodStores = ConcurrentHashMap<String, ObjectStore<MethodHandle>>()
    private val decodeMethodStores = ConcurrentHashMap<String, ObjectStore<MethodHandle>>()
    private val encodeEnumMethodStores = ConcurrentHashMap<String, ObjectStore<MethodHandle>>()
    private val decodeEnumMethodStores = ConcurrentHashMap<String, ObjectStore<MethodHandle>>()

    fun setLogger(logger: KLogger) {
        this.logger = logger
    }

    private class VersionedClassLoader(version: String) : URLClassLoader(
        arrayOf(File("version-$version.jar").toURI().toURL()),
    ) {
        private val classCache = object : ObjectStore<Class<*>>() {
            override fun lookup(name: String): Class<*> {
                logger?.debug{"Loading class $name from $version"}
                return findClass(name)
            }
        }

        fun getClass(name: String): Class<*>? {
            return classCache.get(name)
        }
    }

    private abstract class ObjectStore<T : Any> {
        private val cache = ConcurrentHashMap<String, Optional<T>>()
        private val locks = ConcurrentHashMap<String, Any>() // Separate lock map

        fun get(name: String): T? {
            // Fast path: Returns `null` if previous attempt failed
            cache[name]?.let { return it.orElse(null) }

            // Get per-key lock, ensuring only one thread computes the value
            val lock = locks.computeIfAbsent(name) { Any() }
            synchronized(lock) {
                try {
                    return cache.computeIfAbsent(name) {
                        try {
                            // Wraps successful result
                            Optional.of(lookup(name))
                        } catch (e: Exception) {
                            // Caches failure to avoid retrying
                            logger?.debug(e) { "Exception lookup for $name" }
                            Optional.empty()
                        }
                    }.orElse(null)
                } finally {
                    // Cleanup lock
                    locks.remove(name)
                }
            }
        }

        abstract fun lookup(name: String): T;
    }

    actual fun <T> encodeToByteArray(version: String, className: String, model: T): ByteArray? {
        val store = loadStore(encodeMethodStores, version, "encodeToByteArray")
        return invoke<ByteArray>(store, className, model)
    }

    actual fun <T> decodeFromByteArray(version: String, className: String, byteArray: ByteArray): T? {
        val store = loadStore(decodeMethodStores, version, "decodeFromByteArray")
        return invoke<T>(store, className, byteArray)
    }

    actual fun <T> encodeValue(version: String, className: String, model: T): Int? {
        val store = loadStore(encodeEnumMethodStores, version, "encodeValue")
        return invoke<Int>(store, className, model)
    }

    actual fun <T> decodeValue(version: String, className: String, value: Int): T? {
        val store = loadStore(decodeEnumMethodStores, version, "decodeValue")
        return invoke<T>(store, className, value)
    }

    private fun <R> invoke(store: ObjectStore<MethodHandle>, className: String, param: Any?): R? {
        try {
            // `invokeExact` does not work
            return store.get(className)?.invoke(param) as R?
        } catch (ex: Exception) {
            logger?.error(ex) {"Proto encode/decode failed" }
            return null
        }
    }

    private fun loadStore(
        storesMap: ConcurrentHashMap<String, ObjectStore<MethodHandle>>,
        version: String,
        method: String
    ) = storesMap.computeIfAbsent(version) {
        object : ObjectStore<MethodHandle>() {
            override fun lookup(name: String): MethodHandle {
                val clazz = loadClass(version, name)
                val messageClazz = name.takeIf { it.startsWith(PROTO_CLASS_PREFIX) }
                    ?.let {
                        ClassLoader.getSystemClassLoader()
                            .loadClass(MESSAGE_CLASS_PREFIX + it.substring(PROTO_CLASS_PREFIX.length))
                    }
                    ?: Any::class.java

                // TODO: maybe better to throw error instead of fallback
                val methodType = when (method) {
                    "encodeToByteArray",
                    "encodeValue" ->
                        MethodType.methodType(ByteArray::class.java, messageClazz)

                    "decodeFromByteArray",
                    "decodeValue" ->
                        MethodType.methodType(messageClazz, ByteArray::class.java)

                    else ->
                        MethodType.methodType(Any::class.java, Any::class.java)
                }

                return methodLookup.findStatic(clazz, method, methodType)
            }
        }
    }

    private fun loadClass(
        version: String,
        className: String
    ): Class<*>? {
        val classLoader = classLoaders.computeIfAbsent(version) {
            VersionedClassLoader(version)
        }
        return classLoader.getClass(className)
    }
}