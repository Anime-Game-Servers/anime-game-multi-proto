package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@ProtoCommand(CommandType.RESPONSE)
interface GetPlayerTokenRsp {
    var msg: String
    var uid: Int
    var token: String
    var blackUidEndTime: Int
    var accountType: Int
    var accountUid: String
    var retCode: Int
    @AddedIn(VERSION.V0_9_0)
    var isProficientPlayer: Boolean
    @AddedIn(VERSION.V0_9_0)
    var secretKey: String
    @AddedIn(VERSION.V0_9_0)
    var gmUid: Int
    @AddedIn(VERSION.V0_9_0)
    var secretKeySeed: Long
    @AddedIn(VERSION.V0_9_0)
    var securityCmdBuffer: ByteArray
    @AddedIn(VERSION.V0_9_0)
    var platformType: Int
    @AddedIn(VERSION.V0_9_0)
    var extraBinData: ByteArray
    @AddedIn(VERSION.V1_0_0)
    var isGuest: Boolean
    @AddedIn(VERSION.V1_0_0)
    var channelId: Int
    @AddedIn(VERSION.V1_0_0)
    var subChannelId: Int
    @AddedIn(VERSION.V1_0_0)
    var tag: Int
    @AddedIn(VERSION.V1_1_0)
    var countryCode: String
    @AddedIn(VERSION.V1_2_0)
    var isLoginWhiteList: Boolean
    @AddedIn(VERSION.V1_5_0)
    var psnId: String
    @AddedIn(VERSION.V1_5_0)
    var clientVersionRandomKey: String
    @AddedIn(VERSION.V2_0_0)
    var regPlatform: Int
    @AddedIn(VERSION.V2_0_0)
    var clientIpStr: String
    @AddedIn(VERSION.V2_3_0)
    var birthday: String
    @AddedIn(VERSION.V2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(VERSION.V2_7_0)
    var isWatchdogUid: Boolean
    @AddedIn(VERSION.V2_8_0)
    var serverRandKey: String
    @AddedIn(VERSION.V2_8_0)
    var keyId: Int
    @AddedIn(VERSION.V2_8_0)
    var finishCollectionIdList: List<Int>
    @AddedIn(VERSION.V2_8_0)
    var sign: String
}
