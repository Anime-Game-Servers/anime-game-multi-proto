package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.blueprint

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface HomeBlueprintSearchInfo {
    var blockId: Int
    var moduleId: Int
    var sceneId: Int
    var shareCode: String
}
