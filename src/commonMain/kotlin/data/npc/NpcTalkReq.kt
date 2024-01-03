package data.npc

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
internal interface NpcTalkReq {
    var npcEntityId: Int
    @RemovedIn(VERSION.V0_9_0)
    var talkType: NpcTalkType
    var talkId: Int
    @AddedIn(VERSION.V1_4_0)
    var entityId: Int
}
