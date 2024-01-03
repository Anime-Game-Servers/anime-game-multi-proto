package data.activity.user_generated_content

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

/**
 *
 */
@AddedIn(VERSION.V2_7_0)
@ProtoEnum
enum class GetUgcType {
    @AltName("GET_UGC_TYPE_NONE")
    GET_UGC_NONE,
    GET_UGC_TYPE_MINE,
    GET_UGC_TYPE_PUBLISH
}