package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1) @RemovedIn(Version.GI_0_9_0)
@ProtoEnum
enum class NpcTalkType {
    TALK_NONE,
    TALK_START,
    TALK_CHOOSE,
    TALK_NEXT,
    TALK_FINISH,
}