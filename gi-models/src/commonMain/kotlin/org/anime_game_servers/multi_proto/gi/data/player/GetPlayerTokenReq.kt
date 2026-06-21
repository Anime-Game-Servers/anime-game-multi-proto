package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface GetPlayerTokenReq {
    var accountType: Int
    var accountUid: String
    @AltName("token")
    var accountToken: String
    var accountExt: String
    var uid: Int
    @AddedIn(GI_CB2)
    var isGuest: Boolean
    @AddedIn(GI_0_9_0)
    var platformType: Int
    @AddedIn(GI_0_9_0)
    var cloudClientIp: Int
    @AddedIn(GI_0_9_0)
    var onlineId: String
    @AddedIn(GI_0_9_0)
    var psnRegion: String
    @AddedIn(GI_1_0_0)
    var channelId: Int
    @AddedIn(GI_1_0_0)
    var subChannelId: Int
    @AddedIn(GI_1_1_0)
    var countryCode: String
    @AddedIn(GI_1_5_0)
    var psnId: String
    @AddedIn(GI_2_0_0)
    var clientIpStr: String
    @AddedIn(GI_2_3_0)
    var birthday: String
    @AddedIn(GI_2_3_0)
    var minorsRegMinAge: Int
    @AddedIn(GI_2_8_0)
    var clientRandKey: String
    @AddedIn(GI_2_8_0)
    var keyId: Int
}
