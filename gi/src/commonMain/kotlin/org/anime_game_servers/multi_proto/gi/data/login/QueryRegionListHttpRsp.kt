package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoModel
internal interface QueryRegionListHttpRsp {
    var retcode: Retcode
    @RemovedIn(GI_1_0_0)
    var clientCustomConfig: String
    var regionList: List<RegionSimpleInfo>
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var clientConfig: ClientCustomConfig
    @AddedIn(GI_0_9_0)
    var clientCustomConfigEncrypted: ByteArray
    @AddedIn(GI_0_9_0)
    var clientSecretKey: ByteArray
    @AddedIn(GI_0_9_0)
    var enableLoginPc: Boolean
}