package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
interface GetPlayerTokenReq {
    var accountType: Int
    var accountUid: String
    var accountToken: String
    var accountExt: String
    var uid: Int
    @AddedIn(Version.GI_CB2)
    var isGuest: Boolean
    @AddedIn(Version.GI_0_9_0)
    var platformType: Int
    @AddedIn(Version.GI_0_9_0)
    var cloudClientIp: Int
    @AddedIn(Version.GI_0_9_0)
    var onlineId: String
    @AddedIn(Version.GI_0_9_0)
    var psnRegion: String
    @AddedIn(Version.GI_1_0_0)
    var channelId: Int
    @AddedIn(Version.GI_1_0_0)
    var subChannelId: Int
    @AddedIn(Version.GI_1_1_0)
    var countryCode: String
    @AddedIn(Version.GI_1_5_0)
    var psnId: String
    @AddedIn(Version.GI_2_0_0)
    var clientIpStr: String
    @AddedIn(Version.GI_2_3_0)
    var birthday: String
    @AddedIn(Version.GI_2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(Version.GI_2_8_0)
    var clientRandKey: String
    @AddedIn(Version.GI_2_8_0)
    var keyId: Int
}
