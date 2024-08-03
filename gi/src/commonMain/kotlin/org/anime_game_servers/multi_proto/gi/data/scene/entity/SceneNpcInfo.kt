package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneNpcInfo {
    var npcId: Int
    var roomId: Int
    @AddedIn(Version.GI_CB2)
    var questId: Int
    @AddedIn(Version.GI_0_9_0)
    var blockId: Int
}
