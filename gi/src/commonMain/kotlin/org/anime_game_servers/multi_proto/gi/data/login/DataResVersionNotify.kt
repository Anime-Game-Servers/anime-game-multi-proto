package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.server.ResVersionConfig

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface DataResVersionNotify {
    @AltName("dataVersion")
    var clientDataVersion: Int
    @AddedIn(GI_CB2)
    @RemovedIn(GI_0_9_0)
    var resVersionEx: Int
    @AddedIn(GI_0_9_0)
    var clientMd5: String
    @AddedIn(GI_0_9_0)
    var clientSilenceDataVersion: Int
    @AddedIn(GI_0_9_0)
    var clientSilenceMd5: String
    @AddedIn(GI_0_9_0)
    var clientSilenceVersionSuffix: String
    @AddedIn(GI_0_9_0)
    var clientVersionSuffix: String
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var isResNeedRelogin: Boolean
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var resMd5: String
    @RemovedIn(GI_1_0_0)
    var resVersion: Int
    @AddedIn(GI_0_9_0)
    var resVersionConfig: ResVersionConfig
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var resVersionSuffix: String
    @AddedIn(GI_1_1_0)
    var isDataNeedRelogin: Boolean
    @AddedIn(GI_1_2_0)
    var opType: DataResVersionOpType
}
