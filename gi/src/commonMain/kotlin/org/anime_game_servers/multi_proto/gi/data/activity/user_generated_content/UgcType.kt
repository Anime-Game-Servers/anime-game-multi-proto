package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

/**
 * Defines the type of user generated content.
 * Currently only music game is supported.
 */
@AddedIn(Version.GI_2_7_0)
@ProtoEnum
enum class UgcType {
    UGC_TYPE_NONE,
    UGC_TYPE_MUSIC_GAME
}