package data.activity.aster

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface AsterMidCampInfo {
    var campId: Int
    var pos: Vector
}