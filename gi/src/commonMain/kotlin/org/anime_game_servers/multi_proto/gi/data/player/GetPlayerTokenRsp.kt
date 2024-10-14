package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetPlayerTokenRsp {
    var retCode: Retcode
    var msg: String
    var uid: Int
    var token: String
    var blackUidEndTime: Int
    var accountType: Int
    var accountUid: String
    @AddedIn(Version.GI_0_9_0)
    var isProficientPlayer: Boolean
    @AddedIn(Version.GI_0_9_0)
    var secretKey: String
    @AddedIn(Version.GI_0_9_0)
    var gmUid: Int
    @AddedIn(Version.GI_0_9_0)
    var secretKeySeed: Long
    @AddedIn(Version.GI_0_9_0)
    var securityCmdBuffer: ByteArray
    @AddedIn(Version.GI_0_9_0)
    var platformType: Int
    @AddedIn(Version.GI_0_9_0)
    var extraBinData: ByteArray
    @AddedIn(Version.GI_1_0_0)
    var isGuest: Boolean
    @AddedIn(Version.GI_1_0_0)
    var channelId: Int
    @AddedIn(Version.GI_1_0_0)
    var subChannelId: Int
    @AddedIn(Version.GI_1_0_0)
    var tag: Int
    @AddedIn(Version.GI_1_1_0)
    var countryCode: String
    @AddedIn(Version.GI_1_2_0)
    var isLoginWhiteList: Boolean
    @AddedIn(Version.GI_1_5_0)
    var psnId: String
    @AddedIn(Version.GI_1_5_0)
    var clientVersionRandomKey: String
    @AddedIn(Version.GI_2_0_0)
    var regPlatform: Int
    @AddedIn(Version.GI_2_0_0)
    var clientIpStr: String
    @AddedIn(Version.GI_2_3_0)
    var birthday: String
    @AddedIn(Version.GI_2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(Version.GI_2_7_0)
    var isWatchdogUid: Boolean
    @AddedIn(Version.GI_2_8_0)
    var serverRandKey: String
    @AddedIn(Version.GI_2_8_0)
    var keyId: Int
    @AddedIn(Version.GI_2_8_0)
    var finishCollectionIdList: List<Int>
    @AddedIn(Version.GI_2_8_0)
    var sign: String
}
