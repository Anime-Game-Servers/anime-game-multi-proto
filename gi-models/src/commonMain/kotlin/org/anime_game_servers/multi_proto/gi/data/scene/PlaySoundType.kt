package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum("ScenePlayerSoundNotify")
internal enum class PlaySoundType {
    @AltName("PLAY_SOUND_TYPE_NONE")
    PLAY_SOUND_NONE,
    @AltName("PLAY_SOUND_TYPE_START")
    PLAY_SOUND_START,
    @AltName("PLAY_SOUND_TYPE_STOP")
    PLAY_SOUND_STOP,
}
