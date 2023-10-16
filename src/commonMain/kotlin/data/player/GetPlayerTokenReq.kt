package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
interface GetPlayerTokenReq {
    var accountType: Int
    var accountUid: String
    var accountToken: String
    var accountExt: String
    var uid: Int
    @AddedIn(VERSION.VCB2)
    var isGuest: Boolean
    @AddedIn(VERSION.V0_9_0)
    var platformType: Int
    @AddedIn(VERSION.V0_9_0)
    var cloudClientIp: Int
    @AddedIn(VERSION.V0_9_0)
    var onlineId: String
    @AddedIn(VERSION.V0_9_0)
    var psnRegion: String
    @AddedIn(VERSION.V1_0_0)
    var channelId: Int
    @AddedIn(VERSION.V1_0_0)
    var subChannelId: Int
    @AddedIn(VERSION.V1_1_0)
    var countryCode: String
    @AddedIn(VERSION.V1_5_0)
    var psnId: String
    @AddedIn(VERSION.V2_0_0)
    var clientIpStr: String
    @AddedIn(VERSION.V2_3_0)
    var birthday: String
    @AddedIn(VERSION.V2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(VERSION.V2_8_0)
    var clientRandKey: Int
    @AddedIn(VERSION.V2_8_0)
    var keyId: Int
}
