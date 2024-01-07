package data.activity.user_generated_content.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_7_0)
@ProtoModel
interface UgcMusicTrack {
    var musicNoteList: List<UgcMusicNote>
}