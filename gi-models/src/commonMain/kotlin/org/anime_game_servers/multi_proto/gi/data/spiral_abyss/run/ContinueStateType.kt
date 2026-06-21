package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.run

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum("TowerLevelEndNotify")
internal enum class ContinueStateType {
    @AltName("CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE")
    CONTINUE_STATE_CAN_NOT_CONTINUE,
    @AltName("CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL")
    CONTINUE_STATE_CAN_ENTER_NEXT_LEVEL,
    @AltName("CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR")
    CONTINUE_STATE_CAN_ENTER_NEXT_FLOOR,
}
