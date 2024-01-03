package data.npc

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1) @RemovedIn(VERSION.V0_9_0)
@ProtoEnum
enum class NpcTalkType {
    TALK_NONE,
    TALK_START,
    TALK_CHOOSE,
    TALK_NEXT,
    TALK_FINISH,
}