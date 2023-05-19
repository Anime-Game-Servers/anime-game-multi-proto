package interfaces

import messages.VERSION

interface ProtoModelDecoder<T> {
    fun parseBy(data: ByteArray, version: VERSION): T
}