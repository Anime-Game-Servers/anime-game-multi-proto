package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.mark_point

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface HomeMarkPointNPCData {
    var avatarId: Int
    var costumeId: Int
}
