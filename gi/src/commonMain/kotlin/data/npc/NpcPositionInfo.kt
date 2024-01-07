package data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel(alternativeNames = ["NpcPostionInfo"])
interface NpcPositionInfo {
    var npcId: Int
    var pos: Vector
}
