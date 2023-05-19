package interfaces

import messages.VERSION

interface ProtoModel {
    fun encodeToByteArray(version: VERSION) : ByteArray?
}