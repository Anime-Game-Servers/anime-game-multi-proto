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

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface SceneGalleryInfo {
    var galleryId: Int
    var endTime: Int
    @AddedIn(GI_3_2_0)
    var startTime: Int
    var stage: GalleryStageType
    var preStartEndTime: Int
    @AddedIn(GI_1_6_0)
    var progressInfoList: List<SceneGalleryProgressInfo>
    @AddedIn(GI_1_6_0)
    var playerCount: Int
    @AddedIn(GI_2_3_0)
    var ownerUid: Int

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
    )

    var info: OneOfType
}