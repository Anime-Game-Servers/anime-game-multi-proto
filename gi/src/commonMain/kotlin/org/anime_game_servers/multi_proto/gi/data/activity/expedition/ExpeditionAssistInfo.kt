package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface ExpeditionAssistInfo {
    var assistTime: Int
    var avatarId: Int
    var onlineId: String
    var targetNickName: String
    @AddedIn(GI_1_6_0)
    var costumeId: Int
}
