package data.general.server

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface RegionInfo {
    var gateserverIp: String
    var gateserverPort: Int
    @RemovedIn(VERSION.V0_9_0)
    var clientCustomConfig: String
    @RemovedIn(VERSION.V0_9_0)
    var regionCustomConfig: String
    @RemovedIn(VERSION.VCB2)
    var accountUrl: String
    @RemovedIn(VERSION.VCB2)
    var accountUrlBak: String
    var payCallbackUrl: String
    @AddedIn(VERSION.V0_9_0)
    var areaType: String
    var resourceUrl: String
    var dataUrl: String
    var feedbackUrl: String
    var bulletinUrl: String
    var resourceUrlBak: String
    var dataUrlBak: String
    @RemovedIn(VERSION.V0_9_0)
    var dataVersion: Int
    var clientDataVersion: Int
    @RemovedIn(VERSION.V1_0_0)
    var resVersion: Int
    var handbookUrl: String
    @AddedIn(VERSION.VCB2) @RemovedIn(VERSION.V0_9_0)
    var resVersionEx: Int
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceDataVersion: Int
    @AddedIn(VERSION.V0_9_0)
    var clientDataMd5: String
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceDataMd5: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var resMd5: String
    @AddedIn(VERSION.V0_9_0)
    var resVersionConfig: ResVersionConfig
    @AddedIn(VERSION.V0_9_0)
    var secretKey: ByteArray
    @AddedIn(VERSION.V0_9_0)
    var officialCommunityUrl: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var versionSuffix: String
    @AddedIn(VERSION.V0_9_0)
    var clientVersionSuffix: String
    @AddedIn(VERSION.V0_9_0)
    var clientSilenceVersionSuffix: String
    @AddedIn(VERSION.V1_0_0)
    var useGateserverDomainName: Boolean
    @AddedIn(VERSION.V1_0_0)
    var gateserverDomainName: String
    @AddedIn(VERSION.V1_0_0)
    var userCenterUrl: String
    @AddedIn(VERSION.V1_0_0)
    var accountBindUrl: String
    @AddedIn(VERSION.V1_0_0)
    var cdkeyUrl: String
    @AddedIn(VERSION.V1_0_0)
    var privacyPolicyUrl: String
    @AddedIn(VERSION.V1_2_0)
    var nextResourceUrl: String
    @AddedIn(VERSION.V1_2_0)
    var nextResVersionConfig: ResVersionConfig
    @AddedIn(VERSION.V3_2_0)
    var gameBiz: String
}
