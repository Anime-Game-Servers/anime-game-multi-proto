package data.activity

import org.anime_game_servers.core.base.annotations.AddedIn
import data.activity.aster.AsterActivityDetailInfo
import data.activity.crucible.CrucibleActivityDetailInfo
import data.activity.delivery.DeliveryActivityDetailInfo
import data.activity.echo_shell.EchoShellDetailInfo
import data.activity.flight.FlightActivityDetailInfo
import data.activity.music_game.MusicGameActivityDetailInfo
import data.activity.salesman.SalesmanActivityDetailInfo
import data.activity.sea_lamp.SeaLampActivityDetailInfo
import data.activity.sea_lamp.SeaLampActivityInfo
import data.activity.summer_time.SummerTimeDetailInfo
import data.activity.summer_time_v2.SummerTimeV2DetailInfo
import data.activity.trial.TrialAvatarActivityDetailInfo
import data.activity.user_generated_content.UgcActivityDetailInfo
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
@AddedIn(GI_0_9_0)
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
    @AddedIn(GI_1_0_0)
    var meetCondList: List<Int>
    @AddedIn(GI_1_0_0)
    var expireCondList: List<Int>
    @AddedIn(GI_1_3_0)
    var selectedAvatarRewardId: Int
    @AddedIn(GI_1_4_0)
    var activityCoinMap: Map<Int, Int>
    @AddedIn(GI_1_5_0)
    var curScore: Int
    @AddedIn(GI_1_5_0)
    var scoreLimit: Int
    @AddedIn(GI_1_5_0)
    var takenRewardList: List<Int>
    @AddedIn(GI_1_6_0)
    var isHidden: Boolean
    @AddedIn(GI_2_0_0)
    var firstDayStartTime: Int
    @AddedIn(GI_2_4_0)
    var isBannerCleared: Boolean
    @AddedIn(GI_2_6_0)
    var isQuickOpen: Boolean
    @AddedIn(GI_2_7_0)
    var wishGiftNumMap: Map<Int, Int>
    @AddedIn(GI_2_8_0)
    var activityPushTipsDataList: List<ActivityPushTipsData>
    @AddedIn(GI_3_2_0)
    var isCommonContentClosed: Boolean
    //TODO 3.4 has a UInt list named fdjefldhela, find usage and name it

    @OneOf(
        types = [
            OneOfEntry(SeaLampActivityDetailInfo::class, "sam_lamp_info"),
            OneOfEntry(CrucibleActivityDetailInfo::class, "crucible_info"),
            OneOfEntry(SalesmanActivityDetailInfo::class, "salesman_info", addedIn = GI_1_0_0),
            OneOfEntry(TrialAvatarActivityDetailInfo::class, "trial_avatar_info", addedIn = GI_1_0_0),
            OneOfEntry(DeliveryActivityDetailInfo::class, "delivery_info", addedIn = GI_1_1_0),
            OneOfEntry(AsterActivityDetailInfo::class, "aster_info", addedIn = GI_1_1_0),
            OneOfEntry(FlightActivityDetailInfo::class, "flight_info", addedIn = GI_1_1_0),
            // 1.2.0
            //DragonSpineActivityDetailInfo::class,
            //EffigyActivityDetailInfo::class,
            //TreasureMapActivityDetailInfo::class,
            // 1.3.0
            //BlessingActivityDetailInfo::class,
            OneOfEntry(SeaLampActivityInfo::class, "sea_lamp_info", addedIn = GI_1_3_0),
            //ExpeditionActivityDetailInfo::class,
            // 1.4.0
            //ArenaChallengeActivityDetailInfo::class,
            //FleurFairActivityDetailInfo::class,
            //WaterSpiritActivityDetailInfo::class,
            // 1.5.0
            //ChannelerSlabActivityDetailInfo::class,
            //MistTrialActivityDetailInfo::class,
            //HideAndSeekActivityDetailInfo::class,
            //FindHilichurlDetailInfo::class,
            // 1.6.0
            OneOfEntry(SummerTimeDetailInfo::class, "summer_time_info", addedIn = GI_1_6_0),
            //BuoyantCombatDetailInfo::class,
            OneOfEntry(EchoShellDetailInfo::class, "echo_shell_info", addedIn = GI_1_6_0),
            //EchoShellDetailInfo::class,
            //BounceConjuringActivityDetailInfo::class,
            // 2.0.0
            //BlitzRushActivityDetailInfo::class,
            //ChessActivityDetailInfo::class,
            // 2.1.0
            //SumoActivityDetailInfo::class,
            //MoonfinTrialActivityDetailInfo::class,
            //LunaRiteDetailInfo::class,
            // 2.2.0
            //PlantFlowerActivityDetailInfo::class,
            OneOfEntry(MusicGameActivityDetailInfo::class, "music_game_info", addedIn = GI_2_2_0),
            //RoguelikeDungeonActivityDetailInfo::class,
            //DigActivityDetailInfo::class,
            // 2.3.0
            //HachiActivityDetailInfo::class,
            //WinterCampActivityDetailInfo::class,
            // 2.4.0
            //PotionActivityDetailInfo::class,
            //TanukiTravelActivityDetailInfo::class,
            //LanternRiteActivityDetailInfo::class,
            // 2.5.0
            //MichiaeMatsuriActivityDetailInfo::class,
            //BartenderActivityDetailInfo::class,
            OneOfEntry(UgcActivityDetailInfo::class, "ugc_info", addedIn = GI_2_5_0),
            // 2.6.0
            //CrystalLinkActivityDetailInfo::class,
            //IrodoriActivityDetailInfo::class,
            //PhotoActivityDetailInfo::class,
            //SpiceActivityDetailInfo::class,
            // 2.7.0
            //GachaActivityDetailInfo::class,
            //LuminanceStoneChallengeActivityDetailInfo::class,
            //RogueDiaryActivityDetailInfo::class,
            // 2.8.0
            OneOfEntry(SummerTimeV2DetailInfo::class, "summer_time_v2_info", addedIn = GI_2_8_0),
            //OneOfEntry(IslandPartyDetailInfo::class, "island_party_info"),
            //GearActivityDetailInfo::class,
            // 3.0.0
            //GravenInnocenceDetailInfo::class,
            //InstableSprayDetailInfo::class,
            //MuqadasPotionActivityDetailInfo::class,
            //TreasureSeelieActivityDetailInfo::class,
            // 3.1.0
            //RockBoardExploreDetailInfo::class,
            //VintageActivityDetailInfo::class,
            //WindFieldDetailInfo::class,
            // 3.2.0
            //FungusFighterDetailInfo::class,
            //CharAmusementDetailInfo::class,
            //EffigyChallengeV2DetailInfo::class,
            // 3.3.0
            //CoinCollectDetailInfo::class,
            //BrickBreakerDetailInfo::class,
            // 3.4.0
            //DuelHeartInfo::class,
            //SeaLampV3Info::class,
            //TeamChainInfo::class,
            //ElectroherculesBattleInfo::class,
            //GcgFestivalInfo::class,
            // 3.5.0
            // FleurFairV2DetailInfo::class,
            // FungusFighterV2DetailInfo::class,
            // 3.6.0
            // AkaFesDetailInfo::class,
            // SandwormCannonDetailInfo::class,
            // SorushTrialDetailInfo::class,
            // 3.7.0
            // EffigyChallengeV4Info::class,
            // GcgPveInfo::class,
            // UgcV2Info::class,
            // PenumbraAdventureInfo::class,
            // 3.8.0
            // AnimalViewInfo::class,
            // ActivityMultiCharacterInfo::class,
            // GcgPveInfiniteInfo::class,
            // 4.0.0
            // ToyBattleInfo::class,
            // PhotoUnderseaInfo::class,
            // FontaineGatherInfo::class,
            // GcgPvePuzzleInfo::class,
            // 4.1.0 TODO
            // 4.2.0 TODO
            // 4.3.0 TODO
        ]
    )
    var detail: OneOfType
}