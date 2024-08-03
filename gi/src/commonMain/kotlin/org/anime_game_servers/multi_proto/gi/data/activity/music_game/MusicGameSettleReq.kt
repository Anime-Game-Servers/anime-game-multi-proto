package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_2_0)
@ProtoCommand(CommandType.REQUEST)
interface MusicGameSettleReq {
    val musicBasicId: Int
    val score: Int
    val combo: Int
    val correctHit: Int
    @AddedIn(Version.GI_2_7_0)
    val ugcGuid: Long
    @AddedIn(Version.GI_2_7_0)
    val isSaveScore: Boolean
    @AddedIn(Version.GI_2_7_0)
    val restartTimes: Int
    @AddedIn(Version.GI_2_7_0)
    val scoreRating: Int
    @AddedIn(Version.GI_2_7_0)
    val starRating: Int
    @AddedIn(Version.GI_2_7_0)
    val noteList: List<Int>
    @AddedIn(Version.GI_2_7_0)
    val maxCombo: Int
    @AddedIn(Version.GI_2_7_0)
    val isFullCombo: Int
    @AddedIn(Version.GI_2_7_0)
    val buttonList: List<Int>
    @AddedIn(Version.GI_2_7_0)
    val volume: Int
    @AddedIn(Version.GI_2_7_0)
    val isCustomDelay: Boolean
    @AddedIn(Version.GI_2_7_0)
    val delay: Int
    @AddedIn(Version.GI_2_7_0)
    val isCustomSpeed: Boolean
    @AddedIn(Version.GI_2_7_0)
    val speed: Float

}