package data.npc

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V1_4_0)
@ProtoCommand(CommandType.REQUEST)
internal interface MeetNpcReq {
    var npcId: Int
}
