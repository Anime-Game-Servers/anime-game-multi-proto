package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_2_0)
@ProtoCommand(CommandType.REQUEST)
interface MusicGameStartReq {
    val musicBasicId: Int
    @AddedIn(Version.GI_2_7_0)
    val ugcGuid: Long
    @AddedIn(Version.GI_2_7_0)
    val isSaveScore: Boolean
}
