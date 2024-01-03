package data.activity.music_game

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_2_0)
@ProtoCommand(CommandType.REQUEST)
interface MusicGameStartReq {
    val musicBasicId: Int
    @AddedIn(VERSION.V2_7_0)
    val ugcGuid: Long
    @AddedIn(VERSION.V2_7_0)
    val isSaveScore: Boolean
}
