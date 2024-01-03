package data.login

import annotations.AddedIn
import data.general.server.RegionInfo
import messages.VERSION
import org.anime_game_servers.annotations.*

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
interface QueryCurrRegionHttpRsp {
    var msg: String
    var regionInfo: RegionInfo
    var clientSecretKey: ByteArray
    var regionCustomConfigEncrypted: ByteArray
    var clientRegionCustomConfigEncrypted: ByteArray
    @OneOf(
        OneOfEntry(ForceUpdateInfo::class, "force_udpate"),
        OneOfEntry(StopServerInfo::class, "stop_server")
    )
    var detail: OneOfType
    var retCode: Int
}