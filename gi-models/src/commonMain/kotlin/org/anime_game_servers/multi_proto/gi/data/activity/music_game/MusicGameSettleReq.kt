package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(REQUEST)
internal interface MusicGameSettleReq {
    val combo: Int
    val correctHit: Int
    val musicBasicId: Int
    val score: Int
    @AddedIn(GI_2_7_0)
    val buttonList: List<Int>
    @AddedIn(GI_2_7_0)
    val delay: Int
    @AddedIn(GI_2_7_0)
    val isCustomDelay: Boolean
    @AddedIn(GI_2_7_0)
    val isCustomSpeed: Boolean
    @AddedIn(GI_2_7_0)
    val isFullCombo: Int
    @AddedIn(GI_2_7_0)
    val isSaveScore: Boolean
    @AddedIn(GI_2_7_0)
    val maxCombo: Int
    @AddedIn(GI_2_7_0)
    val noteList: List<Int>
    @AddedIn(GI_2_7_0)
    val restartTimes: Int
    @AddedIn(GI_2_7_0)
    val scoreRating: Int
    @AddedIn(GI_2_7_0)
    val speed: Float
    @AddedIn(GI_2_7_0)
    val starRating: Int
    @AddedIn(GI_2_7_0)
    val ugcGuid: Long
    @AddedIn(GI_2_7_0)
    val volume: Int
}
