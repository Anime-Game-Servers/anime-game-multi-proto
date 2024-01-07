package data.activity.music_game

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface MusicGameRecord {
    var isUnlock: Boolean
    var maxScore: Int
    var maxCombo: Int
}