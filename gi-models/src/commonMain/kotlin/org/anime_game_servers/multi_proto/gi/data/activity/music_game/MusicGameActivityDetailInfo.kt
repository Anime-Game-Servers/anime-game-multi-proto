package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

/**
 * Information about a music game activity. This includes the current user records and user generated content.
 * @property musicGameRecordMap The current user records.
 * @property ugcRecordList
 * @property ugcSearchList
 */
@AddedIn(GI_2_2_0)
@ProtoModel
internal interface MusicGameActivityDetailInfo {
    var musicGameRecordMap: Map<Int, MusicGameRecord>
    @AddedIn(GI_2_7_0)
    var ugcRecordList: List<UgcMusicBriefInfo>
    @AddedIn(GI_2_7_0)
    var ugcSearchList: List<UgcMusicBriefInfo>
}