package data.activity

import annotations.AddedIn
import data.activity.aster.AsterActivityDetailInfo
import data.activity.crucible.CrucibleActivityDetailInfo
import data.activity.delivery.DeliveryActivityDetailInfo
import data.activity.flight.FlightActivityDetailInfo
import data.activity.music_game.MusicGameActivityDetailInfo
import data.activity.salesman.SalesmanActivityDetailInfo
import data.activity.sea_lamp.SeaLampActivityDetailInfo
import data.activity.summer_time.SummerTimeDetailInfo
import data.activity.summer_time_v2.SummerTimeV2DetailInfo
import data.activity.trial.TrialAvatarActivityDetailInfo
import data.activity.user_generated_content.UgcActivityDetailInfo
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface ActivityInfo {
    var activityId: Int
    var scheduleId: Int
    var beginTime: Int
    var endTime: Int
    var activityType: Int
    var isPlayOpenAnim: Boolean
    var isFinished: Boolean
    var isStarting: Boolean
    var watcherInfoList: List<ActivityWatcherInfo>
    @AddedIn(VERSION.V1_0_0)
    var meetCondList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var expireCondList: List<Int>

    var takenRewardList: List<Int>
    var isHidden: Boolean
    var activityCoinMap: Map<Int, Int>
    var isBannerCleared: Boolean
    var curScore: Int
    var firstDayStartTime: Int
    var scoreLimit: Int
    var wishGiftNumMap: Map<Int, Int>
    var selectedAvatarRewardId: Int
    var isCommonContentClosed: Boolean
    var activityPushTipsDataList: List<ActivityPushTipsData>
    @AddedIn(VERSION.V3_0_0)
    var isQuickOpen: Boolean

    @OneOf(
        types = [
            SeaLampActivityDetailInfo::class,
            CrucibleActivityDetailInfo::class,
            SalesmanActivityDetailInfo::class,
            TrialAvatarActivityDetailInfo::class,
            DeliveryActivityDetailInfo::class,
            AsterActivityDetailInfo::class,
            FlightActivityDetailInfo::class,

            SummerTimeV2DetailInfo::class,
            SummerTimeDetailInfo::class,
            MusicGameActivityDetailInfo::class,
            UgcActivityDetailInfo::class
        ]
    )
    var detail: OneOfType
}