package data.activity.user_generated_content.music_game

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_7_0)
@ProtoModel
interface UgcMusicNote {
    var startTime: Int
    var endTime: Int
}