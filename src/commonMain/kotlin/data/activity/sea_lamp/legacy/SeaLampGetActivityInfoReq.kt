package data.activity.sea_lamp.legacy

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2) @RemovedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampGetActivityInfoReq {
}