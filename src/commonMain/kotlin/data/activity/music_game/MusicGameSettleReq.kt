package data.activity.music_game

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_2_0)
@ProtoCommand(CommandType.REQUEST)
interface MusicGameSettleReq {
    val musicBasicId: Int
    val score: Int
    val combo: Int
    val correctHit: Int
    @AddedIn(VERSION.V2_7_0)
    val ugcGuid: Long
    @AddedIn(VERSION.V2_7_0)
    val isSaveScore: Boolean
    @AddedIn(VERSION.V2_7_0)
    val restartTimes: Int
    @AddedIn(VERSION.V2_7_0)
    val scoreRating: Int
    @AddedIn(VERSION.V2_7_0)
    val starRating: Int
    @AddedIn(VERSION.V2_7_0)
    val noteList: List<Int>
    @AddedIn(VERSION.V2_7_0)
    val maxCombo: Int
    @AddedIn(VERSION.V2_7_0)
    val isFullCombo: Int
    @AddedIn(VERSION.V2_7_0)
    val buttonList: List<Int>
    @AddedIn(VERSION.V2_7_0)
    val volume: Int
    @AddedIn(VERSION.V2_7_0)
    val isCustomDelay: Boolean
    @AddedIn(VERSION.V2_7_0)
    val delay: Int
    @AddedIn(VERSION.V2_7_0)
    val isCustomSpeed: Boolean
    @AddedIn(VERSION.V2_7_0)
    val speed: Float

}