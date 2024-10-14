package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.server.ResVersionConfig
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface PlayerLoginRsp {
    var retCode: Retcode
    var playerData: ByteArray
    var isNewPlayer: Boolean
    var targetUid: Int
    var loginRand: Long
    var isUseAbilityHash: Boolean
    var abilityHashCode: Int
    var abilityHashMap: Map<String, Int>
    @RemovedIn(Version.GI_0_9_0) // replaced with clientDataVersion
    var dataVersion: Int
    @AddedIn(Version.GI_0_9_0)
    var clientDataVersion: Int
    @RemovedIn(Version.GI_1_0_0)
    var resVersion: Int
    var isRelogin: Boolean
    @AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
    var resVersionEx: Int
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceDataVersion: Int
    @AddedIn(Version.GI_0_9_0)
    var playerDataVersion: Int
    @AddedIn(Version.GI_CB2)
    var gameBiz: String
    @AddedIn(Version.GI_0_9_0)
    var clientMd5: String
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceMd5: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var resMd5: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var isResNeedRelogin: Boolean
    @AddedIn(Version.GI_0_9_0)
    var resVersionConfig: ResVersionConfig
    @AddedIn(Version.GI_0_9_0)
    var blockInfoMap: Map<Int, BlockInfo>
    @AddedIn(Version.GI_0_9_0)
    var clientVersionSuffix: String
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceVersionSuffix: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var resVersionSuffix: String
    @AddedIn(Version.GI_1_0_0)
    var shortAbilityHashMap: List<ShortAbilityHashPair>
    @AddedIn(Version.GI_1_0_0)
    var scInfo: ByteArray
    @AddedIn(Version.GI_1_0_0)
    var isAudit: Boolean
    @AddedIn(Version.GI_1_0_0)
    var isScOpen: Boolean
    @AddedIn(Version.GI_1_0_0)
    var registerCps: String
    @AddedIn(Version.GI_1_1_0)
    var featureBlockInfoList: List<FeatureBlockInfo>
    @AddedIn(Version.GI_1_1_0)
    var isDataNeedRelogin: Boolean
    @AddedIn(Version.GI_1_1_0)
    var countryCode: String
    @AddedIn(Version.GI_1_2_0)
    var nextResVersionConfig: ResVersionConfig
    @AddedIn(Version.GI_1_2_0)
    var nextResourceUrl: String
    @AddedIn(Version.GI_1_5_0)
    var targetHomeOwnerUid: Int
    @AddedIn(Version.GI_1_6_0)
    var isEnableClientHashDebug: Boolean
    @AddedIn(Version.GI_2_0_0)
    var isTransfer: Boolean
    @AddedIn(Version.GI_2_2_0)
    var totalTickTime: Double
    @AddedIn(Version.GI_2_3_0)
    var birthday: String
    @AddedIn(Version.GI_3_1_0)
    var isLoginRspSplit: Boolean
}
