package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneNpcInfo {
    var npcId: Int
    var roomId: Int
    @AddedIn(VERSION.VCB2)
    var questId: Int
    @AddedIn(VERSION.V0_9_0)
    var blockId: Int
}
