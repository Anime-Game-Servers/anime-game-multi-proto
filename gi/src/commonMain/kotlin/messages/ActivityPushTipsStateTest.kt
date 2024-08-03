package messages

import org.anime_game_servers.core.base.Version

enum class ActivityPushTipsStateTest {
    ACTIVITY_PUSH_TIPS_STATE_NONE,
    ACTIVITY_PUSH_TIPS_STATE_START,
    ACTIVITY_PUSH_TIPS_STATE_READ,
    UNRECOGNISED;

    fun encodeToByteArray(version: Version): Int?{
        return when (version.namespace) {
            "V3_2" -> encodeToV3_2().value
            else -> null
        }
    }

    fun encodeToV3_2() : protos.V3_2.ActivityPushTipsState {
        return protos.V3_2.ActivityPushTipsState.fromName(name)
    }

    companion object{
        fun parseBy(value:Int, version: Version): ActivityPushTipsStateTest {
            return when(version.namespace) {
                "V3_2" -> {
                    parseByV3_2(value)
                }
                else -> {
                    ACTIVITY_PUSH_TIPS_STATE_NONE
                }
            }
        }

        fun parseByV3_2(value:Int) : ActivityPushTipsStateTest {
            val parsed = protos.V3_2.ActivityPushTipsState.fromValue(value)

            return parsed.name?.let {
                ActivityPushTipsStateTest.valueOf(it)
            } ?: UNRECOGNISED
        }
    }
}