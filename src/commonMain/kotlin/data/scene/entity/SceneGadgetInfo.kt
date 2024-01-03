package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import data.activity.echo_shell.EchoShellInfo
import data.gadget.BlossomChestInfo
import data.gadget.FoundationInfo
import data.gadget.GadgetGeneralRewardInfo
import data.general.CustomGadgetTreeInfo
import data.general.RoutePoint
import data.general.item.Item
import data.general.vehicle.VehicleInfo
import messages.*
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB2
import messages.VERSION.V0_9_0
import messages.VERSION.V1_0_0
import messages.VERSION.V1_1_0
import messages.VERSION.V1_2_0
import messages.VERSION.V1_3_0
import messages.VERSION.V1_4_0
import messages.VERSION.V1_6_0
import messages.VERSION.V2_0_0
import messages.VERSION.V2_1_0
import messages.VERSION.V2_2_0
import messages.VERSION.V2_8_0
import messages.VERSION.V3_0_0

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneGadgetInfo {
    var gadgetId: Int
    var groupId: Int
    var configId: Int
    var ownerEntityId: Int
    var bornType: GadgetBornType
    var gadgetState: Int
    var gadgetType: Int
    var isShowCutscene: Boolean
    var authorityPeerId: Int
    var isEnableInteract: Boolean
    @AddedIn(VCB2)
    var interactId: Int
    @AddedIn(V0_9_0)
    var markFlag: Int
    @AddedIn(V1_0_0)
    var propOwnerEntityId: Int
    @AddedIn(V1_3_0)
    var platform: PlatformInfo
    @AddedIn(V1_3_0)
    var interactUidList: List<Int>
    @AddedIn(V1_4_0)
    var draftId: Int
    @AddedIn(V1_4_0)
    var gadgetTalkState: Int
    @AddedIn(V0_9_0)
    var playInfo: GadgetPlayInfo

    @OneOf(
        OneOfEntry(Item::class, "trifle_item"),
        OneOfEntry(Int::class, "item_id", removedIn = GI_CB2),
        OneOfEntry(GatherGadgetInfo::class, "gather_gadget", addedIn = GI_CB2),
        OneOfEntry(WorktopInfo::class, "worktop"),
        OneOfEntry(ClientGadgetInfo::class, "client_gadget"),
        OneOfEntry(PlatformInfo::class, "item_id", removedIn = GI_1_3_0),
        OneOfEntry(WeatherInfo::class, "weather"),
        OneOfEntry(AbilityGadgetInfo::class, "ability_gadget"),
        OneOfEntry(StatueGadgetInfo::class, "statue_gadget", addedIn = GI_CB2),
        OneOfEntry(BossChestInfo::class, "boss_chest", addedIn = GI_0_9_0),
        OneOfEntry(BlossomChestInfo::class, "blossom_chest", addedIn = GI_0_9_0),
        OneOfEntry(MpPlayRewardInfo::class, "mp_play_reward", addedIn = GI_0_9_0),
        OneOfEntry(GadgetGeneralRewardInfo::class, "general_reward", addedIn = GI_1_1_0),
        OneOfEntry(OfferingInfo::class, "offering_info", addedIn = GI_1_2_0),
        OneOfEntry(FoundationInfo::class, "foundation_info", addedIn = GI_1_3_0),
        OneOfEntry(VehicleInfo::class, "vehicle_info", addedIn = GI_1_6_0),
        OneOfEntry(EchoShellInfo::class, "shell_info", addedIn = GI_1_6_0),
        OneOfEntry(ScreenInfo::class, "screen_info", addedIn = GI_2_0_0),
        OneOfEntry(FishPoolInfo::class, "custom_gadget_tree_info", addedIn = GI_2_1_0),
        OneOfEntry(CustomGadgetTreeInfo::class, "custom_gadget_tree_info", addedIn = GI_2_2_0),
        OneOfEntry(RoguelikeGadgetInfo::class, "roguelike_gadget_info", addedIn = GI_2_2_0),
        OneOfEntry(NightCrowGadgetInfo::class, "night_crow_gadget_info", addedIn = GI_2_8_0),
        OneOfEntry(DeshretObeliskGadgetInfo::class, "deshret_obelisk_gadget_info", addedIn = GI_3_8_0),
    )
    var content: OneOfType
}
