package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneDataNotify {
    var levelConfigNameList : List<String>
    @AddedIn(GI_2_8_0)
    var sceneTagIdList : List<Int>
    @AddedIn(GI_4_0_0)
    var mapLayerInfo: org.anime_game_servers.multi_proto.gi.data.scene.MapLayerInfo
}
