package data.npc

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_4_0)
@ProtoCommand(CommandType.RESPONSE)
interface MeetNpcRsp {
    var npcFirstMetId: Int
    var retCode: Int
}