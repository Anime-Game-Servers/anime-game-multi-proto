package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
interface SeaLampActivityPlayerInfo {
    var contribution: Int
}