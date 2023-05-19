package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface AsterProgressDetailInfo {
    var count: Int
    var lastAutoAddTime: Int
}