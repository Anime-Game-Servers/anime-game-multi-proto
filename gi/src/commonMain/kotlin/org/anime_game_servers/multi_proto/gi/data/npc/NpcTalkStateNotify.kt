package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface NpcTalkStateNotify {
    @RemovedIn(GI_CB2)
    var talkInfoList: List<NpcTalkInfo>
    @AddedIn(GI_2_4_0)
    var isBan: Boolean
}
