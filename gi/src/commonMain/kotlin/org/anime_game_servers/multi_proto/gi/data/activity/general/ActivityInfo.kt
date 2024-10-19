package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.activity.aster.AsterActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.crucible.CrucibleActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.delivery.DeliveryActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.echo_shell.EchoShellDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.fleur_fair.FleurFairActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.flight.FlightActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.music_game.MusicGameActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.salesman.SalesmanActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.legacy.SeaLampActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.SeaLampActivityInfo
import org.anime_game_servers.multi_proto.gi.data.activity.summer_time.SummerTimeDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2.SummerTimeV2DetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.trial.TrialAvatarActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.UgcActivityDetailInfo
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.multi_proto.gi.data.activity.arena_challenge.ArenaChallengeActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.bartender.BartenderActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.blessing.BlessingActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.blitz_rush.BlitzRushActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.bounce_conjuring.BounceConjuringActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker.BrickBreakerDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.buoyant_combat.BuoyantCombatDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab.ChannelerSlabActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.char_amusement.CharAmusementDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.chess.ChessActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.coin_collect.CoinCollectDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.crystal_link.CrystalLinkActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.dig.DigActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.dragonspine.DragonSpineActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.duel_heart.DuelHeartDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge.EffigyActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge_v2.EffigyChallengeV2DetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.electrohercules_battle.ElectroherculesBattleDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.expedition.ExpeditionActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.find_hilichurl.FindHilichurlDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter.FungusFighterDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.gacha.GachaActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.gear.GearActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocenceDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.hachi.HachiActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.hide_and_seek.HideAndSeekActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.instable_spray.InstableSprayDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess.IrodoriActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.island_party.IslandPartyDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite.LanternRiteActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.luminance_stone_challenge.LuminanceStoneChallengeActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.luna_rite.LunaRiteDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri.MichiaeMatsuriActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.mist_trial.MistTrialActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.moonfin_trial.MoonfinTrialActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.muqadas_potion.MuqadasPotionActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.photo.PhotoActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.plant_flower.PlantFlowerActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.potion.PotionActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.rock_board.RockBoardExploreDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary.RogueDiaryActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon.RoguelikeDungeonActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3.SeaLampV3DetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.spice.SpiceActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.sumo.SumoActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.tanuki_travel.TanukiTravelActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.team_chain.TeamChainDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.treasure_map.TreasureMapActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.treasure_seelie.TreasureSeelieActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.vintage.VintageActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.water_spirit.WaterSpiritActivityDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.wind_field.WindFieldDetailInfo
import org.anime_game_servers.multi_proto.gi.data.activity.winter_camp.WinterCampActivityDetailInfo

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface ActivityInfo {
    var activityId: Int
    var activityType: Int
    var beginTime: Int
    var endTime: Int
    var isFinished: Boolean
    var isPlayOpenAnim: Boolean
    var isStarting: Boolean
    var scheduleId: Int
    var watcherInfoList: List<ActivityWatcherInfo>
    @AddedIn(GI_1_0_0)
    var expireCondList: List<Int>
    @AddedIn(GI_1_0_0)
    var meetCondList: List<Int>
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

    @OneOf(
        types = [
            // 0.9.0
            OneOfEntry(SeaLampActivityDetailInfo::class, "sam_lamp_info"),
            OneOfEntry(CrucibleActivityDetailInfo::class, "crucible_info"),
            // 1.0.0
            OneOfEntry(SalesmanActivityDetailInfo::class, "salesman_info", addedIn = GI_1_0_0),
            OneOfEntry(TrialAvatarActivityDetailInfo::class, "trial_avatar_info", addedIn = GI_1_0_0),
            // 1.1.0
            OneOfEntry(DeliveryActivityDetailInfo::class, "delivery_info", addedIn = GI_1_1_0),
            OneOfEntry(AsterActivityDetailInfo::class, "aster_info", addedIn = GI_1_1_0),
            OneOfEntry(FlightActivityDetailInfo::class, "flight_info", addedIn = GI_1_1_0),
            // 1.2.0
            OneOfEntry(DragonSpineActivityDetailInfo::class, "dragon_spine_info", addedIn = GI_1_2_0),
            OneOfEntry(EffigyActivityDetailInfo::class, "effigy_info", addedIn = GI_1_2_0),
            OneOfEntry(TreasureMapActivityDetailInfo::class, "treasure_map_info", addedIn = GI_1_2_0),
            // 1.3.0
            OneOfEntry(BlessingActivityDetailInfo::class, "blessing_info", addedIn = GI_1_3_0),
            OneOfEntry(ExpeditionActivityDetailInfo::class, "expedition_info", addedIn = GI_1_3_0),
            OneOfEntry(SeaLampActivityInfo::class, "sea_lamp_info", addedIn = GI_1_3_0),
            // 1.4.0
            OneOfEntry(ArenaChallengeActivityDetailInfo::class, "arena_challenge_info", addedIn = GI_1_4_0),
            OneOfEntry(FleurFairActivityDetailInfo::class, "fleur_fair_info", addedIn = GI_1_4_0),
            OneOfEntry(WaterSpiritActivityDetailInfo::class, "water_spirit_info", addedIn = GI_1_4_0),
            // 1.5.0
            OneOfEntry(ChannelerSlabActivityDetailInfo::class, "challneler_slab_info", "channeler_slab_info", addedIn = GI_1_5_0),
            OneOfEntry(FindHilichurlDetailInfo::class, "find_hilichurl_info", addedIn = GI_1_5_0),
            OneOfEntry(HideAndSeekActivityDetailInfo::class, "hide_and_seek_info", addedIn = GI_1_5_0),
            OneOfEntry(MistTrialActivityDetailInfo::class, "mist_trial_activity_info", addedIn = GI_1_5_0),
            // 1.6.0
            OneOfEntry(BounceConjuringActivityDetailInfo::class, "bounce_conjuring_info", addedIn = GI_1_6_0),
            OneOfEntry(BuoyantCombatDetailInfo::class, "buoyant_combat_info", addedIn = GI_1_6_0),
            OneOfEntry(SummerTimeDetailInfo::class, "summer_time_info", addedIn = GI_1_6_0),
            OneOfEntry(EchoShellDetailInfo::class, "echo_shell_info", addedIn = GI_1_6_0),
            // 2.0.0
            OneOfEntry(BlitzRushActivityDetailInfo::class, "blitz_rush_info", addedIn = GI_2_0_0),
            OneOfEntry(ChessActivityDetailInfo::class, "chess_info", addedIn = GI_2_0_0),
            // 2.1.0
            OneOfEntry(LunaRiteDetailInfo::class, "luna_rite_info", addedIn = GI_2_1_0),
            OneOfEntry(MoonfinTrialActivityDetailInfo::class, "moonfin_trial_info", addedIn = GI_2_1_0),
            OneOfEntry(SumoActivityDetailInfo::class, "sumo_info", addedIn = GI_2_1_0),
            // 2.2.0
            OneOfEntry(DigActivityDetailInfo::class, "dig_info", addedIn = GI_2_2_0),
            OneOfEntry(MusicGameActivityDetailInfo::class, "music_game_info", addedIn = GI_2_2_0),
            OneOfEntry(PlantFlowerActivityDetailInfo::class, "plant_flower_info", addedIn = GI_2_2_0),
            OneOfEntry(RoguelikeDungeonActivityDetailInfo::class, "roguelike_dungoen_info", "roguelike_dungeon_info", addedIn = GI_2_2_0),
            // 2.3.0
            OneOfEntry(HachiActivityDetailInfo::class, "hachi_info", addedIn = GI_2_3_0),
            OneOfEntry(WinterCampActivityDetailInfo::class, "winter_camp_info", addedIn = GI_2_3_0),
            // 2.4.0
            OneOfEntry(LanternRiteActivityDetailInfo::class, "lantern_rite_activity_info", addedIn = GI_2_4_0),
            OneOfEntry(PotionActivityDetailInfo::class, "potion_info", addedIn = GI_2_4_0),
            OneOfEntry(TanukiTravelActivityDetailInfo::class, "tanuki_travel_activity_info", addedIn = GI_2_4_0),
            // 2.5.0
            OneOfEntry(BartenderActivityDetailInfo::class, "bartender_info", addedIn = GI_2_5_0),
            OneOfEntry(MichiaeMatsuriActivityDetailInfo::class, "michiae_matsuri_info", addedIn = GI_2_5_0),
            OneOfEntry(UgcActivityDetailInfo::class, "ugc_info", addedIn = GI_2_5_0),
            // 2.6.0
            OneOfEntry(CrystalLinkActivityDetailInfo::class, "crystal_link_info", addedIn = GI_2_6_0),
            OneOfEntry(IrodoriActivityDetailInfo::class, "irodori_info", addedIn = GI_2_6_0),
            OneOfEntry(PhotoActivityDetailInfo::class, "photo_info", addedIn = GI_2_6_0),
            OneOfEntry(SpiceActivityDetailInfo::class, "spice_info", addedIn = GI_2_6_0),
            // 2.7.0
            OneOfEntry(GachaActivityDetailInfo::class, "gacha_info", addedIn = GI_2_7_0),
            OneOfEntry(LuminanceStoneChallengeActivityDetailInfo::class, "luminance_stone_challenge_info", addedIn = GI_2_7_0),
            OneOfEntry(RogueDiaryActivityDetailInfo::class, "rogue_diary_info", addedIn = GI_2_7_0),
            // 2.8.0
            OneOfEntry(GearActivityDetailInfo::class, "gear_info", addedIn = GI_2_8_0),
            OneOfEntry(IslandPartyDetailInfo::class, "island_party_info", addedIn = GI_2_8_0),
            OneOfEntry(SummerTimeV2DetailInfo::class, "summer_time_v2_info", addedIn = GI_2_8_0),
            // 3.0.0
            OneOfEntry(GravenInnocenceDetailInfo::class, "graven_innocence_info", addedIn = GI_3_0_0),
            OneOfEntry(InstableSprayDetailInfo::class, "instable_spray_info", addedIn = GI_3_0_0),
            OneOfEntry(MuqadasPotionActivityDetailInfo::class, "muqadas_potion_info", addedIn = GI_3_0_0),
            OneOfEntry(TreasureSeelieActivityDetailInfo::class, "treasure_seelie_info", addedIn = GI_3_0_0),
            // 3.1.0
            OneOfEntry(RockBoardExploreDetailInfo::class, "rock_board_explore_info", addedIn = GI_3_1_0),
            OneOfEntry(VintageActivityDetailInfo::class, "vintage_info", addedIn = GI_3_1_0),
            OneOfEntry(WindFieldDetailInfo::class, "wind_field_info", addedIn = GI_3_1_0),
            // 3.2.0
            OneOfEntry(CharAmusementDetailInfo::class, "char_amusement_info", addedIn = GI_3_2_0),
            OneOfEntry(EffigyChallengeV2DetailInfo::class, "effigy_challenge_info", addedIn = GI_3_2_0),
            OneOfEntry(FungusFighterDetailInfo::class, "fungus_fighter_info", addedIn = GI_3_2_0),
            // 3.3.0
            OneOfEntry(BrickBreakerDetailInfo::class, "brick_breaker_info", addedIn = GI_3_3_0),
            OneOfEntry(CoinCollectDetailInfo::class, "coin_collect_info", addedIn = GI_3_3_0),
            // 3.4.0
            OneOfEntry(RoguelikeDungeonActivityDetailInfo::class, "roguelike_dungeon_info", addedIn = GI_3_4_0),
            OneOfEntry(DuelHeartDetailInfo::class, "duel_heart_info", addedIn = GI_3_4_0),
            OneOfEntry(ElectroherculesBattleDetailInfo::class, "electrohercules_battle_info", addedIn = GI_3_4_0),
            OneOfEntry(SeaLampV3DetailInfo::class, "sea_lamp_v3_info", addedIn = GI_3_4_0),
            OneOfEntry(TeamChainDetailInfo::class, "team_chain_info", addedIn = GI_3_4_0),
            // 3.5.0
            // GcgFestivalInfo::class,
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
            // NEW_ACTIVITY_COLLECT_UNDERWATER
            // NEW_ACTIVITY_QUICK_TIME_COMBAT
            // NEW_ACTIVITY_POETRY_FESTIVAL
            // NEW_ACTIVITY_FISHBLASTER
            // 4.2.0 TODO
            // 4.3.0 TODO
            // 4.4.0 TODO
            // 4.5.0 TODO
            // 4.6.0 TODO
            // 4.7.0 TODO
            // 4.8.0 TODO
            // 5.0.0 TODO
        ]
    )
    var detail: OneOfType
}