package data.npc

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
interface NpcTalkRsp {
    var npcEntityId: Int
    @RemovedIn(VERSION.V0_9_0)
    var talkType: NpcTalkType
    var curTalkId: Int
    @RemovedIn(VERSION.VCB2)
    var nextTalkList: List<Int>
    @AddedIn(VERSION.V1_4_0)
    var entityId: Int
    var retCode: Int
}