package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
interface SeaLampActivityInfoNotify {
    var activityInfo: SeaLampActivityInfo
    var activityPlayerInfo: SeaLampActivityPlayerInfo
}