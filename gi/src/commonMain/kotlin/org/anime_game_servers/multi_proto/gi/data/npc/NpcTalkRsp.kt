package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
interface NpcTalkRsp {
    var npcEntityId: Int
    @RemovedIn(Version.GI_0_9_0)
    var talkType: NpcTalkType
    var curTalkId: Int
    @RemovedIn(Version.GI_CB2)
    var nextTalkList: List<Int>
    @AddedIn(Version.GI_1_4_0)
    var entityId: Int
    var retCode: Int
}