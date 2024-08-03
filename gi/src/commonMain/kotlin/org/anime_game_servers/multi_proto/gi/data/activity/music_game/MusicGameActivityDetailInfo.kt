package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

/**
 * Information about a music game activity. This includes the current user records and user generated content.
 * @property musicGameRecordMap The current user records.
 * @property ugcRecordList
 * @property ugcSearchList
 */
@ProtoModel
interface MusicGameActivityDetailInfo {
    var musicGameRecordMap: Map<Int, org.anime_game_servers.multi_proto.gi.data.activity.music_game.MusicGameRecord>
    var ugcRecordList: List<org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicBriefInfo>
    var ugcSearchList: List<org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicBriefInfo>
}