package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_7_0)
@ProtoEnum
internal enum class RogueDiaryAvatarDisableStatus {
    @AltName("ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE")
    ROGUE_DIARY_AVATAR_DISABLE_NONE,
    @AltName("ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH")
    ROGUE_DIARY_AVATAR_DISABLE_DEATH,
    @AltName("ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED")
    ROGUE_DIARY_AVATAR_DISABLE_TIRED,
    @AltName("ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED")
    ROGUE_DIARY_AVATAR_DISABLE_DUPLICATED,
}
