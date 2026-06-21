package org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter_v2

import org.anime_game_servers.core.base.Version.GI_3_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_5_0)
@ProtoModel
internal interface FungusFighterV2LevelData {
    var isOpen: Boolean
    var levelId: Int
    // TODO unknown field shared with EffigyChallengeV2LevelData and some other messages
    //var unk: Int
}