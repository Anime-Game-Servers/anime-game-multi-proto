package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface RogueDiaryRoomInfo {
    var configId: Int
    var isBoss: Boolean
    var monsterList: List<Uint32Pair>
}
