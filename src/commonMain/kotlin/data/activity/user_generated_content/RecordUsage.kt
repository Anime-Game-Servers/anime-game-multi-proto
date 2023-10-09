package data.activity.user_generated_content

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

/**
 *
 */
@AddedIn(VERSION.V2_7_0)
@ProtoEnum
enum class RecordUsage {
    UGC_RECORD_USAGE_NONE,
    UGC_RECORD_USAGE_IMPORT,
    UGC_RECORD_USAGE_PLAY,
    UGC_RECORD_USAGE_TRIAL,
    UGC_RECORD_USAGE_COMPARE,
}