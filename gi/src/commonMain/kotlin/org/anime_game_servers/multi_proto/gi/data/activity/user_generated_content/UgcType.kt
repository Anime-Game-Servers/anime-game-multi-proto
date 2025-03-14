package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_5_3_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

/**
 * Defines the type of user generated content.
 */
@AddedIn(GI_2_7_0)
@ProtoEnum
internal enum class UgcType {
    UGC_TYPE_NONE,
    UGC_TYPE_MUSIC_GAME,
    /**
     * 5.3 luna rite event sharable post cards
     */
    @AddedIn(GI_5_3_0)
    @AltName("UGC_TYPE_LAN_V_5_CARD_GAME")
    UGC_TYPE_LAN_V5_CARD_GAME,
}