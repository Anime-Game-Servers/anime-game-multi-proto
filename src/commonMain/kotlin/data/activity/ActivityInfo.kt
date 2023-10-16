package data.activity

import annotations.AddedIn
import data.activity.aster.AsterActivityDetailInfo
import data.activity.crucible.CrucibleActivityDetailInfo
import data.activity.delivery.DeliveryActivityDetailInfo
import data.activity.flight.FlightActivityDetailInfo
import data.activity.music_game.MusicGameActivityDetailInfo
import data.activity.salesman.SalesmanActivityDetailInfo
import data.activity.sea_lamp.SeaLampActivityDetailInfo
import data.activity.sea_lamp.SeaLampActivityInfo
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
    @AddedIn(VERSION.V1_3_0)
    var selectedAvatarRewardId: Int
    @AddedIn(VERSION.V1_4_0)
    var activityCoinMap: Map<Int, Int>
    @AddedIn(VERSION.V1_5_0)
    var curScore: Int
    @AddedIn(VERSION.V1_5_0)
    var scoreLimit: Int
    @AddedIn(VERSION.V1_5_0)
    var takenRewardList: List<Int>
    @AddedIn(VERSION.V1_6_0)
    var isHidden: Boolean
    @AddedIn(VERSION.V2_0_0)
    var firstDayStartTime: Int
    @AddedIn(VERSION.V2_4_0)
    var isBannerCleared: Boolean
    @AddedIn(VERSION.V2_6_0)
    var isQuickOpen: Boolean
    @AddedIn(VERSION.V2_7_0)
    var wishGiftNumMap: Map<Int, Int>
    @AddedIn(VERSION.V2_8_0)
    var activityPushTipsDataList: List<ActivityPushTipsData>
    @AddedIn(VERSION.V3_2_0)
    var isCommonContentClosed: Boolean
    //TODO 3.4 has a UInt list named fdjefldhela, find usage and name it

    @OneOf(
        types = [
            SeaLampActivityDetailInfo::class,
            CrucibleActivityDetailInfo::class,
            SalesmanActivityDetailInfo::class,
            TrialAvatarActivityDetailInfo::class,
            DeliveryActivityDetailInfo::class,
            AsterActivityDetailInfo::class,
            FlightActivityDetailInfo::class,
            //DragonSpineActivityDetailInfo::class,
            //EffigyActivityDetailInfo::class,
            //TreasureMapActivityDetailInfo::class,
            //BlessingActivityDetailInfo::class,
            SeaLampActivityInfo::class,
            //ExpeditionActivityDetailInfo::class,
            //ArenaChallengeActivityDetailInfo::class,
            //FleurFairActivityDetailInfo::class,
            //WaterSpiritActivityDetailInfo::class,
            //ChannelerSlabActivityDetailInfo::class,
            //MistTrialActivityDetailInfo::class,
            //HideAndSeekActivityDetailInfo::class,
            //FindHilichurlDetailInfo::class,
            SummerTimeDetailInfo::class,
            //BuoyantCombatDetailInfo::class,
            //EchoShellDetailInfo::class,
            //BounceConjuringActivityDetailInfo::class,
            //BlitzRushActivityDetailInfo::class,
            //ChessActivityDetailInfo::class,
            //SumoActivityDetailInfo::class,
            //MoonfinTrialActivityDetailInfo::class,
            //LunaRiteDetailInfo::class,
            //PlantFlowerActivityDetailInfo::class,
            MusicGameActivityDetailInfo::class,
            //RoguelikeDungeonActivityDetailInfo::class,
            //DigActivityDetailInfo::class,
            //HachiActivityDetailInfo::class,
            //WinterCampActivityDetailInfo::class,
            //PotionActivityDetailInfo::class,
            //TanukiTravelActivityDetailInfo::class,
            //LanternRiteActivityDetailInfo::class,
            //MichiaeMatsuriActivityDetailInfo::class,
            //BartenderActivityDetailInfo::class,
            UgcActivityDetailInfo::class,
            //CrystalLinkActivityDetailInfo::class,
            //IrodoriActivityDetailInfo::class,
            //PhotoActivityDetailInfo::class,
            //SpiceActivityDetailInfo::class,
            //GachaActivityDetailInfo::class,
            //LuminanceStoneChallengeActivityDetailInfo::class,
            //RogueDiaryActivityDetailInfo::class,
            SummerTimeV2DetailInfo::class,
            //IslandPartyDetailInfo::class,
            //GearActivityDetailInfo::class,
            //GravenInnocenceDetailInfo::class,
            //InstableSprayDetailInfo::class,
            //MuqadasPotionActivityDetailInfo::class,
            //TreasureSeelieActivityDetailInfo::class,
            //RockBoardExploreDetailInfo::class,
            //VintageActivityDetailInfo::class,
            //WindFieldDetailInfo::class,
            //FungusFighterDetailInfo::class,
            //CharAmusementDetailInfo::class,
            //EffigyChallengeV2DetailInfo::class,
            //CoinCollectDetailInfo::class,
            //BrickBreakerDetailInfo::class,
            //DuelHeartInfo::class,
            //SeaLampV3Info::class,
            //TeamChainInfo::class,
            //ElectroherculesBattleInfo::class,
            //GcgFestivalInfo::class,
        ]
    )
    var detail: OneOfType
}