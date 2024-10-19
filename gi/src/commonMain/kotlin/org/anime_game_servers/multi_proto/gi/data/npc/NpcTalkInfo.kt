package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@RemovedIn(GI_CB2)
@ProtoModel
internal interface NpcTalkInfo {
    var entityId: Int
    var talkIdList: List<Int>
}
