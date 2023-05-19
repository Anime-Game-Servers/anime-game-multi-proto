package data.activity.music_game

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface MusicGameRecord {
    var isUnlock: Boolean
    var maxScore: Int
    var maxCombo: Int
}