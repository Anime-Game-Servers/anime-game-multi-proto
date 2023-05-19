package messages
import interfaces.ProtoModel
import interfaces.ProtoModelDecoder
import messages.activity.music_game.MusicGameActivityDetailInfo
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import protos.V3_2.ActivityInfo
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

data class ActivityInfoTest @JvmOverloads constructor(
    var isFinished: Boolean = false,
    var activityType: Int = 0,
    var beginTime: Int = 0,
    var takenRewardList: List<Int> = emptyList(),
    var isHidden: Boolean = false,
    var isQuickOpen: Boolean = false,
    var meetCondList: List<Int> = emptyList(),
    var activityCoinMap: Map<Int, Int> = emptyMap(),
    var isBannerCleared: Boolean = false,
    var curScore: Int = 0,
    var firstDayStartTime: Int = 0,
    var activityId: Int = 0,
    var isPlayOpenAnim: Boolean = false,
    var endTime: Int = 0,
    var scoreLimit: Int = 0,
    var wishGiftNumMap: Map<Int, Int> = emptyMap(),
    var selectedAvatarRewardId: Int = 0,
    var isCommonContentClosed: Boolean = false,
    var expireCondList: List<Int> = emptyList(),
    //var activityPushTipsDataList: List<ActivityPushTipsData> = emptyList(),
    //var watcherInfoList: List<ActivityWatcherInfo> = emptyList(),
    var scheduleId: Int = 0,
    var isStarting: Boolean = false,
    var detail: Detail<*> = Detail.UnknownDetailInfo(),
): ProtoModel {
    public sealed class Detail<T>(val value: T) : ProtoModel{
        public class MusicGameActivityDetailInfo(musicGameInfo: messages.activity.music_game.MusicGameActivityDetailInfo) : Detail<messages.activity.music_game.MusicGameActivityDetailInfo>(musicGameInfo)
        //public class SummerTimeDetailInfo(summerTimeInfo: messages.activity.summer_time.SummerTimeDetailInfo) : Detail<messages.activity.summer_time.SummerTimeDetailInfo>(summerTimeInfo)
        public class UnknownDetailInfo() : Detail<UnknownDetail>(UnknownDetail())

        public class UnknownDetail()

        override fun encodeToByteArray(version: messages.VERSION): ByteArray? {
            return when (this) {
                is MusicGameActivityDetailInfo -> value.encodeToByteArray(version)
                //is SummerTimeDetailInfo -> summerTimeInfo.encodeToByteArray(version)
                is UnknownDetailInfo -> null
            }
        }

        internal fun encodeToV3_2(): protos.V3_2.ActivityInfo.Detail<*>?{
            return when (this) {
                is MusicGameActivityDetailInfo -> value.encodeToV3_2().let {
                    protos.V3_2.ActivityInfo.Detail.MusicGameInfo(it)
                }
                //is SummerTimeDetailInfo -> summerTimeInfo.encodeToV3_2()
                is UnknownDetailInfo -> null
            }
        }
        companion object {
            internal fun parseByV3_2(value: protos.V3_2.ActivityInfo.Detail<*>) : Detail<*> {
                return when (value) {
                    is protos.V3_2.ActivityInfo.Detail.MusicGameInfo -> MusicGameActivityDetailInfo(messages.activity.music_game.MusicGameActivityDetailInfo.parseByV3_2(value.value))
                    //is protos.V3_2.ActivityInfo.Detail.SummerTimeDetailInfo -> SummerTimeDetailInfo(messages.activity.summer_time.SummerTimeDetailInfo.parseByV3_2(value.value))
                    else -> UnknownDetailInfo()
                }
            }

        }

    }
    /*var musicGameInfo : MusicGameActivityDetailInfo?
        get() = (detail as? Detail.MusicGameActivityDetailInfo)?.value
        set(value) = if (value != null) {
            detail = Detail.MusicGameActivityDetailInfo(value)
        } else {
            detail = Detail.UnknownDetailInfo()
        }
    var summerTimeInfo : Detail.SummerTimeDetailInfo? = null*/

    override fun encodeToByteArray(version: VERSION) : ByteArray? {
        return when (version.namespace) {
            "V3_2" -> encodeToV3_2().encodeToByteArray()
            else -> null
        }
    }
    internal fun encodeToV3_2() : protos.V3_2.ActivityInfo {
        return protos.V3_2.ActivityInfo(
            isFinished = isFinished,
            activityType = activityType,
            beginTime = beginTime,
            takenRewardList = takenRewardList,
            isHidden = isHidden,
            isQuickOpen = isQuickOpen,
            meetCondList = meetCondList,
            activityCoinMap = activityCoinMap.map { ActivityInfo.ActivityCoinMapEntry(it.key, it.value) },
            isBannerCleared = isBannerCleared,
            curScore = curScore,
            firstDayStartTime = firstDayStartTime,
            activityId = activityId,
            isPlayOpenAnim = isPlayOpenAnim,
            endTime = endTime,
            scoreLimit = scoreLimit,

            selectedAvatarRewardId = selectedAvatarRewardId,
            isCommonContentClosed = isCommonContentClosed,
            expireCondList = expireCondList,
            //activityPushTipsDataList = activityPushTipsDataList.map { it.encodeToV3_2() },
            //watcherInfoList = watcherInfoList.map { it.encodeToV3_2() },
            scheduleId = scheduleId,
            isStarting = isStarting,
            detail = detail.encodeToV3_2(),
        )
    }
    companion object : ProtoModelDecoder<ActivityInfoTest> {
        @JvmStatic
        override fun parseBy(data: ByteArray, version: VERSION): ActivityInfoTest {
            return when(version.namespace) {
                "V3_2" -> {
                    return parseByV3_2(data)
                }
                else -> ActivityInfoTest()
            }
        }
        internal fun parseByV3_2(data:ByteArray) : ActivityInfoTest {
            return parseByV3_2(protos.V3_2.ActivityInfo.decodeFromByteArray(data))
        }
        internal fun parseByV3_2(proto:protos.V3_2.ActivityInfo) : ActivityInfoTest {
            return ActivityInfoTest(
                isFinished = proto.isFinished,
                activityType = proto.activityType,
                beginTime = proto.beginTime,
                takenRewardList = proto.takenRewardList,
                isHidden = proto.isHidden,
                isQuickOpen = proto.isQuickOpen,
                meetCondList = proto.meetCondList,
                activityCoinMap = proto.activityCoinMap.associateByTo(mutableMapOf(), { it.key }, { it.value }),
                isBannerCleared = proto.isBannerCleared,
                curScore = proto.curScore,
                firstDayStartTime = proto.firstDayStartTime,
                activityId = proto.activityId,
                isPlayOpenAnim = proto.isPlayOpenAnim,
                endTime = proto.endTime,
                scoreLimit = proto.scoreLimit,
                wishGiftNumMap = proto.wishGiftNumMap.associateByTo(mutableMapOf(), { it.key }, { it.value }),
                selectedAvatarRewardId = proto.selectedAvatarRewardId,
                isCommonContentClosed = proto.isCommonContentClosed,
                expireCondList = proto.expireCondList,
                //activityPushTipsDataList = proto.activityPushTipsDataList.map { messages.ActivityPushTipsData.parseByV3_2(it) },
                //watcherInfoList = proto.watcherInfoList.map { messages.ActivityWatcherInfo.parseByV3_2(it) },
                scheduleId = proto.scheduleId,
                isStarting = proto.isStarting,
                detail = proto.detail?.let {
                    Detail.parseByV3_2(it)
                }?: Detail.UnknownDetailInfo()
            )
        }

    }
}
