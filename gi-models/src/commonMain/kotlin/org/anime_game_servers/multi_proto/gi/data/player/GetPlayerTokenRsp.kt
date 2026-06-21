package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface GetPlayerTokenRsp {
    var retCode: Retcode
    var msg: String
    var uid: Int
    var token: String
    var blackUidEndTime: Int
    var accountType: Int
    var accountUid: String
    @AddedIn(GI_0_9_0)
    var isProficientPlayer: Boolean
    @AddedIn(GI_0_9_0)
    var secretKey: String
    @AddedIn(GI_0_9_0)
    var gmUid: Int
    @AddedIn(GI_0_9_0)
    var secretKeySeed: Long
    @AddedIn(GI_0_9_0)
    var securityCmdBuffer: ByteArray
    @AddedIn(GI_0_9_0)
    var platformType: Int
    @AddedIn(GI_0_9_0)
    var extraBinData: ByteArray
    @AddedIn(GI_1_0_0)
    var isGuest: Boolean
    @AddedIn(GI_1_0_0)
    var channelId: Int
    @AddedIn(GI_1_0_0)
    var subChannelId: Int
    @AddedIn(GI_1_0_0)
    var tag: Int
    @AddedIn(GI_1_1_0)
    var countryCode: String
    @AddedIn(GI_1_2_0)
    var isLoginWhiteList: Boolean
    @AddedIn(GI_1_5_0)
    var psnId: String
    @AddedIn(GI_1_5_0)
    var clientVersionRandomKey: String
    @AddedIn(GI_2_0_0)
    var regPlatform: Int
    @AddedIn(GI_2_0_0)
    var clientIpStr: String
    @AddedIn(GI_2_3_0)
    var birthday: String
    @AddedIn(GI_2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(GI_2_7_0)
    var isWatchdogUid: Boolean
    @AddedIn(GI_2_8_0)
    var serverRandKey: String
    @AddedIn(GI_2_8_0)
    var keyId: Int
    @AddedIn(GI_2_8_0)
    var finishCollectionIdList: List<Int>
    @AddedIn(GI_2_8_0)
    var sign: String
}
