package interfaces

interface PacketIdProvider {
    fun getPacketId(packageName:String) : Int
    fun getPacketName(packageId:Int) : String?
}