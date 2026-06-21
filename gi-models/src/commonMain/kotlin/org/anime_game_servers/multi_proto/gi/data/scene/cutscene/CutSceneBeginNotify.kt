package org.anime_game_servers.multi_proto.gi.data.scene.cutscene

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface CutSceneBeginNotify {
    var cutsceneId: Int
    var isWaitOthers: Boolean
    @AddedIn(GI_3_1_0)
    var extraParamList: List<CutSceneExtraParam>
}
