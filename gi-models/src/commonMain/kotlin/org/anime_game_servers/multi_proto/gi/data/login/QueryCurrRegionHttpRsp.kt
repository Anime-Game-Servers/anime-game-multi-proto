package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.server.RegionInfo
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.*
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface QueryCurrRegionHttpRsp {
    var retCode: Retcode
    var msg: String
    var regionInfo: RegionInfo
    var clientSecretKey: ByteArray
    var regionCustomConfigEncrypted: ByteArray
    var clientRegionCustomConfigEncrypted: ByteArray
    @OneOf(
        OneOfEntry(ForceUpdateInfo::class,"force_update", "force_udpate"),
        OneOfEntry(StopServerInfo::class, "stop_server")
    )
    var detail: OneOfType
}