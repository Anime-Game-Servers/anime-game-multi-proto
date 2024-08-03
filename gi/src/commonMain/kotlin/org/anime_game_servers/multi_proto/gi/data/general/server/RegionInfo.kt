package org.anime_game_servers.multi_proto.gi.data.general.server

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface RegionInfo {
    var gateserverIp: String
    var gateserverPort: Int
    @RemovedIn(Version.GI_0_9_0)
    var clientCustomConfig: String
    @RemovedIn(Version.GI_0_9_0)
    var regionCustomConfig: String
    @RemovedIn(Version.GI_CB2)
    var accountUrl: String
    @RemovedIn(Version.GI_CB2)
    var accountUrlBak: String
    var payCallbackUrl: String
    @AddedIn(Version.GI_0_9_0)
    var areaType: String
    var resourceUrl: String
    var dataUrl: String
    var feedbackUrl: String
    var bulletinUrl: String
    var resourceUrlBak: String
    var dataUrlBak: String
    @RemovedIn(Version.GI_0_9_0)
    var dataVersion: Int
    var clientDataVersion: Int
    @RemovedIn(Version.GI_1_0_0)
    var resVersion: Int
    var handbookUrl: String
    @AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
    var resVersionEx: Int
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceDataVersion: Int
    @AddedIn(Version.GI_0_9_0)
    var clientDataMd5: String
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceDataMd5: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var resMd5: String
    @AddedIn(Version.GI_0_9_0)
    var resVersionConfig: org.anime_game_servers.multi_proto.gi.data.general.server.ResVersionConfig
    @AddedIn(Version.GI_0_9_0)
    var secretKey: ByteArray
    @AddedIn(Version.GI_0_9_0)
    var officialCommunityUrl: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var versionSuffix: String
    @AddedIn(Version.GI_0_9_0)
    var clientVersionSuffix: String
    @AddedIn(Version.GI_0_9_0)
    var clientSilenceVersionSuffix: String
    @AddedIn(Version.GI_1_0_0)
    var useGateserverDomainName: Boolean
    @AddedIn(Version.GI_1_0_0)
    var gateserverDomainName: String
    @AddedIn(Version.GI_1_0_0)
    var userCenterUrl: String
    @AddedIn(Version.GI_1_0_0)
    var accountBindUrl: String
    @AddedIn(Version.GI_1_0_0)
    var cdkeyUrl: String
    @AddedIn(Version.GI_1_0_0)
    var privacyPolicyUrl: String
    @AddedIn(Version.GI_1_2_0)
    var nextResourceUrl: String
    @AddedIn(Version.GI_1_2_0)
    var nextResVersionConfig: org.anime_game_servers.multi_proto.gi.data.general.server.ResVersionConfig
    @AddedIn(Version.GI_3_2_0)
    var gameBiz: String
}
