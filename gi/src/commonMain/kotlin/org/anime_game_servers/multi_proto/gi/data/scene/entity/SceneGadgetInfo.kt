package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.CustomGadgetTreeInfo
import org.anime_game_servers.multi_proto.gi.data.general.item.Item
import org.anime_game_servers.multi_proto.gi.data.general.vehicle.VehicleInfo
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_3_8_0

@AddedIn(GI_CB1)
@ProtoModel
internal interface SceneGadgetInfo {
    var gadgetId: Int
    var groupId: Int
    var configId: Int
    var ownerEntityId: Int
    var bornType: org.anime_game_servers.multi_proto.gi.data.scene.entity.GadgetBornType
    var gadgetState: Int
    var gadgetType: Int
    var isShowCutscene: Boolean
    var authorityPeerId: Int
    var isEnableInteract: Boolean
    @AddedIn(GI_CB2)
    var interactId: Int
    @AddedIn(GI_0_9_0)
    var markFlag: Int
    @AddedIn(GI_1_0_0)
    var propOwnerEntityId: Int
    @AddedIn(GI_1_3_0)
    var platform: org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo
    @AddedIn(GI_1_3_0)
    var interactUidList: List<Int>
    @AddedIn(GI_1_4_0)
    var draftId: Int
    @AddedIn(GI_1_4_0)
    var gadgetTalkState: Int
    @AddedIn(GI_0_9_0)
    var playInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.GadgetPlayInfo

    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.Item::class, "trifle_item"),
        OneOfEntry(Int::class, "item_id", removedIn = GI_CB2),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.GatherGadgetInfo::class, "gather_gadget", addedIn = GI_CB2),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.WorktopInfo::class, "worktop"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.ClientGadgetInfo::class, "client_gadget"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo::class, "item_id", removedIn = GI_1_3_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.WeatherInfo::class, "weather"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.AbilityGadgetInfo::class, "ability_gadget"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.StatueGadgetInfo::class, "statue_gadget", addedIn = GI_CB2),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.BossChestInfo::class, "boss_chest", addedIn = GI_0_9_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.gadget.BlossomChestInfo::class, "blossom_chest", addedIn = GI_0_9_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.MpPlayRewardInfo::class, "mp_play_reward", addedIn = GI_0_9_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.gadget.GadgetGeneralRewardInfo::class, "general_reward", addedIn = GI_1_1_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.OfferingInfo::class, "offering_info", addedIn = GI_1_2_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.gadget.FoundationInfo::class, "foundation_info", addedIn = GI_1_3_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.vehicle.VehicleInfo::class, "vehicle_info", addedIn = GI_1_6_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.activity.echo_shell.EchoShellInfo::class, "shell_info", addedIn = GI_1_6_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.ScreenInfo::class, "screen_info", addedIn = GI_2_0_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.FishPoolInfo::class, "custom_gadget_tree_info", addedIn = GI_2_1_0),
        OneOfEntry(CustomGadgetTreeInfo::class, "custom_gadget_tree_info", addedIn = GI_2_2_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.RoguelikeGadgetInfo::class, "roguelike_gadget_info", addedIn = GI_2_2_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.NightCrowGadgetInfo::class, "night_crow_gadget_info", addedIn = GI_2_8_0),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.DeshretObeliskGadgetInfo::class, "deshret_obelisk_gadget_info", addedIn = GI_3_8_0),
    )
    var content: OneOfType
}
