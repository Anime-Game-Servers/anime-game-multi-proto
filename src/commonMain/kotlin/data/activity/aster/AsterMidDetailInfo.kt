package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface AsterMidDetailInfo {
    var isOpen: Boolean
    var campList: List<AsterMidCampInfo>
    var collectCount: Int
    var beginTime: Int
}