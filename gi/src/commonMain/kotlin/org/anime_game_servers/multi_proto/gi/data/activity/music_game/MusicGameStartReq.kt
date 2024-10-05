package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(REQUEST)
internal interface MusicGameStartReq {
    val musicBasicId: Int
    @AddedIn(GI_2_7_0)
    val isSaveScore: Boolean
    @AddedIn(GI_2_7_0)
    val ugcGuid: Long
}
