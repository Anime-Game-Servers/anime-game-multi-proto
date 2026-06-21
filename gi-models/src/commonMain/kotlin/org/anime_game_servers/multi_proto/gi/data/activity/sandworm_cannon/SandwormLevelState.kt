package org.anime_game_servers.multi_proto.gi.data.activity.sandworm_cannon

import org.anime_game_servers.core.base.Version.GI_3_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_6_0)
@ProtoEnum(alternativeNames = ["SandwormLevelStateType"])
enum class SandwormLevelState {
    SANDWORM_LEVEL_NOT_OPEN,
    SANDWORM_LEVEL_PRE_QUEST,
    SANDWORM_LEVEL_START,
    SANDWORM_LEVEL_SEQUEL_QUEST,
}