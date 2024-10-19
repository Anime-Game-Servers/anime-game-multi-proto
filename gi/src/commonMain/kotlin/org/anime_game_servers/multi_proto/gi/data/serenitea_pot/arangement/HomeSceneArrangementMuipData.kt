package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface HomeSceneArrangementMuipData {
    var blockDataList: List<HomeBlockArrangementMuipData>
    var isRoom: Boolean
    var moduleId: Int
    var sceneId: Int
}
