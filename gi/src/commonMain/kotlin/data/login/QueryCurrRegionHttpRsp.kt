package data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.server.RegionInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.*

@AddedIn(Version.GI_CB1)
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