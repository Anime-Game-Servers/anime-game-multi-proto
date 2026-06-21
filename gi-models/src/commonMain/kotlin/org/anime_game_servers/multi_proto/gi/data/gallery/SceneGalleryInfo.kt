package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.multi_proto.gi.data.gallery.balloon.SceneGalleryBalloonInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.bounce_conjuring.SceneGalleryBounceConjuringInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.broken_floor.SceneGalleryBrokenFloorInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.bullet.SceneGalleryBulletInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.buoyant_combat.SceneGalleryBuoyantCombatInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.char_amusement.SceneGalleryCharAmusementInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.crystal_link.SceneGalleryCrystalLinkInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.effigy_challenge_v2.SceneGalleryEffigyChallengeV2Info
import org.anime_game_servers.multi_proto.gi.data.gallery.fall.SceneGalleryFallInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.flower.SceneGalleryFlowerInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.fungus_fighter.SceneGalleryFungusFighterCaptureInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.fungus_fighter.SceneGalleryFungusFighterTrainingInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.handball.SceneGalleryHandballInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.hide_and_seek.SceneGalleryHideAndSeekInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.home.SceneGalleryHomeBalloonInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.home.SceneGalleryHomeSeekFurnitureInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.instable_spray.SceneGalleryInstableSprayInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.irodori_master.SceneGalleryIrodoriMasterInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.island_party.SceneGalleryIslandPartyDownHillInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.island_party.SceneGalleryIslandPartyRaftInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.island_party.SceneGalleryIslandPartySailInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.luminance_stone_challenge.SceneGalleryLuminanceStoneChallengeInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.muqadas_potion.SceneGalleryMuqadasPotionInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.salvage_escort.SceneGallerySalvageEscortInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.salvage_prevent.SceneGallerySalvagePreventInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.summer_time_v2_boat.SceneGallerySummerTimeV2BoatInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.sumo.SceneGallerySumoInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.treasure_seelie.SceneGalleryTreasureSeelieInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.vintage_hunting.SceneGalleryVintageHuntingInfo
import org.anime_game_servers.multi_proto.gi.data.gallery.wind_field.SceneGalleryWindFieldInfo

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface SceneGalleryInfo {
    var endTime: Int
    var galleryId: Int
    var preStartEndTime: Int
    var stage: GalleryStageType
    @AddedIn(GI_1_6_0)
    var playerCount: Int
    @AddedIn(GI_1_6_0)
    var progressInfoList: List<SceneGalleryProgressInfo>
    @AddedIn(GI_2_3_0)
    var ownerUid: Int
    @AddedIn(GI_3_2_0)
    var startTime: Int

    @OneOf(
        OneOfEntry(SceneGalleryBalloonInfo::class, "balloon_info"),
        OneOfEntry(SceneGalleryFallInfo::class, "fall_info"),
        OneOfEntry(SceneGalleryFlowerInfo::class, "flower_info"),
        OneOfEntry(SceneGalleryBulletInfo::class, "bullet_info"),
        OneOfEntry(SceneGalleryBrokenFloorInfo::class, "broken_floor_info"),
        OneOfEntry(SceneGalleryHideAndSeekInfo::class, "hide_and_seek_info", addedIn = GI_1_5_0),
        OneOfEntry(SceneGalleryBuoyantCombatInfo::class, "buoyant_combat_info", addedIn = GI_1_6_0),
        OneOfEntry(SceneGalleryBounceConjuringInfo::class, "bounce_conjuring_info", addedIn = GI_1_6_0),
        OneOfEntry(SceneGalleryHandballInfo::class, "handball_info", addedIn = GI_2_0_0),
        OneOfEntry(SceneGallerySumoInfo::class, "sumo_info", addedIn = GI_2_1_0),
        OneOfEntry(SceneGallerySalvagePreventInfo::class, "salvage_prevent_info", addedIn = GI_2_4_0),
        OneOfEntry(SceneGallerySalvageEscortInfo::class, "salvage_escort_info", addedIn = GI_2_4_0),
        OneOfEntry(SceneGalleryHomeBalloonInfo::class, "home_balloon_info", addedIn = GI_2_6_0),
        OneOfEntry(SceneGalleryCrystalLinkInfo::class, "crystal_link_info", addedIn = GI_2_6_0),
        OneOfEntry(SceneGalleryIrodoriMasterInfo::class, "irodori_master_info", addedIn = GI_2_6_0),
        OneOfEntry(SceneGalleryLuminanceStoneChallengeInfo::class, "luminance_stone_challenge_info", addedIn = GI_2_7_0),
        OneOfEntry(SceneGalleryHomeSeekFurnitureInfo::class, "home_seek_furniture_info", addedIn = GI_2_7_0),
        OneOfEntry(SceneGallerySummerTimeV2BoatInfo::class, "summer_time_v2_boat_info", addedIn = GI_2_8_0),
        OneOfEntry(SceneGalleryIslandPartyDownHillInfo::class, "island_party_down_hill_info", addedIn = GI_2_8_0),
        OneOfEntry(SceneGalleryIslandPartyRaftInfo::class, "island_party_raft_info", addedIn = GI_2_8_0),
        OneOfEntry(SceneGalleryIslandPartySailInfo::class, "island_party_sail_info", addedIn = GI_2_8_0),
        OneOfEntry(SceneGalleryInstableSprayInfo::class, "instable_spray_info", addedIn = GI_3_0_0),
        OneOfEntry(SceneGalleryMuqadasPotionInfo::class, "muqadas_potion_info", addedIn = GI_3_0_0),
        OneOfEntry(SceneGalleryTreasureSeelieInfo::class, "treasure_seelie_info", addedIn = GI_3_0_0),
        OneOfEntry(SceneGalleryVintageHuntingInfo::class, "vintage_hunting_info", addedIn = GI_3_1_0),
        OneOfEntry(SceneGalleryWindFieldInfo::class, "wind_field_info", addedIn = GI_3_1_0),
        OneOfEntry(SceneGalleryFungusFighterTrainingInfo::class, "fungus_fighter_training_info", addedIn = GI_3_2_0),
        OneOfEntry(SceneGalleryFungusFighterCaptureInfo::class, "fungus_fighter_capture_info", addedIn = GI_3_2_0),
        OneOfEntry(SceneGalleryEffigyChallengeV2Info::class, "effigy_challenge_info", addedIn = GI_3_2_0),
        OneOfEntry(SceneGalleryCharAmusementInfo::class, "char_amusement_info", addedIn = GI_3_2_0),
        //OneOfEntry(SceneGalleryCoinCollectInfo::class, "coin_collect_info", addedIn = GI_3_3_0),
        //OneOfEntry(SceneGalleryTeamChainInfo::class, "team_chain_info", addedIn = GI_3_4_0),
        //OneOfEntry(SceneGalleryDuelHeartInfo::class, "duel_heart_info", addedIn = GI_3_4_0),
        //OneOfEntry(SceneGalleryBoatMultiInfo::class, "boat_multi_info", addedIn = GI_3_4_0),
    )

    var info: OneOfType
}