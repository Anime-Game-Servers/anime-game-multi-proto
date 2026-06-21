package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
interface UgcMusicBriefInfo{
    var importFromUgcGuid: Long
    var isPublished: Boolean
    var isPlayed: Boolean
    var musicId: Int
    var savePageType: Int
    var saveIdx: Int
    var creatorNickname: String
    var version: Int
    var saveTime: Int
    var afterNoteList: List<Int>
    var beforeNoteList: List<Int>
    var isPsnPlatform: Boolean
    var timeLineEditTime: Int
    var isChangedAfterPublish: Boolean
    var publishTime: Int
    var maxScore: Int
    var realTimeEditTime: Int
    var noteCount: Int
    var ugcGuid: Long
    var selfMaxScore: Int
}
