package org.anime_game_servers.multi_proto.gi.data.scene.camera

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_1_0)
@ProtoEnum("BeginCameraSceneLookWithTemplateNotify")
internal enum class FollowType {
    FOLLOW_TYPE_INIT_FOLLOW_POS,
    FOLLOW_TYPE_SET_FOLLOW_POS,
    FOLLOW_TYPE_SET_ABS_FOLLOW_POS,
}
