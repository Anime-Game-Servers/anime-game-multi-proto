package data.npc

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V0_9_0)
@ProtoModel(alternativeNames = ["NpcPostionInfo"])
interface NpcPositionInfo {
    var npcId: Int
    var pos: Vector
}
