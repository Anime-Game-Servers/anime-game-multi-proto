package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_4_0)
@ProtoCommand(CommandType.RESPONSE)
interface MeetNpcRsp {
    var npcFirstMetId: Int
    var retCode: Int
}