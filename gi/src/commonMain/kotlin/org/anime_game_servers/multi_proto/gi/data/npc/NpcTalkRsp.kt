package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface NpcTalkRsp {
    var retCode: Retcode
    var npcEntityId: Int
    @RemovedIn(GI_0_9_0)
    var talkType: NpcTalkType
    var curTalkId: Int
    @RemovedIn(GI_CB2)
    var nextTalkList: List<Int>
    @AddedIn(GI_1_4_0)
    var entityId: Int
}