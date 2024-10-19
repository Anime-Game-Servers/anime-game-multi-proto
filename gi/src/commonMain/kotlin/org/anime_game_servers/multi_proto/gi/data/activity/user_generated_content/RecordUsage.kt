package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

/**
 *
 */
@AddedIn(GI_2_7_0)
@ProtoEnum
internal enum class RecordUsage {
    @AltName("RECORD_USAGE_UGC_RECORD_USAGE_NONE")
    UGC_RECORD_USAGE_NONE,
    @AltName("RECORD_USAGE_UGC_RECORD_USAGE_IMPORT")
    UGC_RECORD_USAGE_IMPORT,
    @AltName("RECORD_USAGE_UGC_RECORD_USAGE_PLAY")
    UGC_RECORD_USAGE_PLAY,
    @AltName("RECORD_USAGE_UGC_RECORD_USAGE_TRIAL")
    UGC_RECORD_USAGE_TRIAL,
    @AltName("RECORD_USAGE_UGC_RECORD_USAGE_COMPARE")
    UGC_RECORD_USAGE_COMPARE,
}