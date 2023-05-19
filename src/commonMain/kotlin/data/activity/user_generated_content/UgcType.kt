package data.activity.user_generated_content

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

/**
 * Defines the type of user generated content.
 * Currently only music game is supported.
 */
@AddedIn(VERSION.V2_7_0)
@ProtoEnum
enum class UgcType {
    UGC_TYPE_NONE,
    UGC_TYPE_MUSIC_GAME
}