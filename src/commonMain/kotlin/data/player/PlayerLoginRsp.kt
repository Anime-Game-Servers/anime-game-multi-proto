package data.player

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
interface PlayerLoginRsp {
    var playerData: ByteArray
    var isNewPlayer: Boolean
    var targetUid: Int
    var loginRand: Long
    var isUseAbilityHash: Boolean
    var abilityHashCode: Int
    var abilityHashMap: Map<String, Int>
    @RemovedIn(VERSION.V0_9_0) // replaced with clientDataVersion
    var dataVersion: Int
    @AddedIn(VERSION.V0_9_0)
    var clientDataVersion: Int
    @RemovedIn(VERSION.V1_0_0)
    var resVersion: Int
    var isRelogin: Boolean
    var retCode: Int
    @AddedIn(VERSION.VCB2) @RemovedIn(VERSION.V0_9_0)
    var resVersionEx: Int
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceDataVersion: Int
    @AddedIn(VERSION.V0_9_0)
    var playerDataVersion: Int
    @AddedIn(VERSION.VCB2)
    var gameBiz: String
    @AddedIn(VERSION.V0_9_0)
    var clientMd5: String
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceMd5: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var resMd5: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var isResNeedRelogin: Boolean
    @AddedIn(VERSION.V0_9_0)
    var resVersionConfig: ResVersionConfig
    @AddedIn(VERSION.V0_9_0)
    var blockInfoMap: Map<Int, BlockInfo>
    @AddedIn(VERSION.V0_9_0)
    var clientVersionSuffix: String
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceVersionSuffix: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var resVersionSuffix: String
    @AddedIn(VERSION.V1_0_0)
    var shortAbilityHashMap: List<ShortAbilityHashPair>
    @AddedIn(VERSION.V1_0_0)
    var scInfo: Int
    @AddedIn(VERSION.V1_0_0)
    var isAudit: Boolean
    @AddedIn(VERSION.V1_0_0)
    var isScOpen: Boolean
    @AddedIn(VERSION.V1_0_0)
    var registerCps: String
    @AddedIn(VERSION.V1_1_0)
    var featureBlockInfoList: List<FeatureBlockInfo>
    @AddedIn(VERSION.V1_1_0)
    var isDataNeedRelogin: Boolean
    @AddedIn(VERSION.V1_1_0)
    var countryCode: String
    @AddedIn(VERSION.V1_2_0)
    var nextResVersionConfig: ResVersionConfig
    @AddedIn(VERSION.V1_2_0)
    var nextResourceUrl: String
    @AddedIn(VERSION.V1_5_0)
    var targetHomeOwnerUid: Int
    @AddedIn(VERSION.V1_6_0)
    var isEnableClientHashDebug: Boolean
    @AddedIn(VERSION.V2_0_0)
    var isTransfer: Boolean
    @AddedIn(VERSION.V2_2_0)
    var totalTickTime: Double
    @AddedIn(VERSION.V2_3_0)
    var birthday: String
    @AddedIn(VERSION.V3_1_0)
    var isLoginRspSplit: Boolean
}
