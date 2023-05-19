package data.activity.user_generated_content.music_game

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_7_0)
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
