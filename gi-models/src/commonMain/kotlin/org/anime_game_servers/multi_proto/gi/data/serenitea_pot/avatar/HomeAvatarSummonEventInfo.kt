package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.avatar

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface HomeAvatarSummonEventInfo {
    var avatarId: Int
    var eventId: Int
    var eventOverTime: Int
    var guid: Int
    var randomPosition: Int
    var suitId: Int
}
