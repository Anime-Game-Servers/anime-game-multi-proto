package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.CustomGadgetTreeInfo
import org.anime_game_servers.multi_proto.gi.data.general.item.Item
import org.anime_game_servers.multi_proto.gi.data.general.vehicle.VehicleInfo
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.activity.echo_shell.gadget.EchoShellInfo
import org.anime_game_servers.multi_proto.gi.data.gadget.BlossomChestInfo
import org.anime_game_servers.multi_proto.gi.data.gadget.FoundationInfo
import org.anime_game_servers.multi_proto.gi.data.gadget.GadgetGeneralRewardInfo

@AddedIn(GI_CB1)
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
    @AddedIn(GI_CB2)
    var interactId: Int
    @AddedIn(GI_0_9_0)
    var markFlag: Int
    @AddedIn(GI_1_0_0)
    var propOwnerEntityId: Int
    @AddedIn(GI_1_3_0)
    var platform: PlatformInfo
    @AddedIn(GI_1_3_0)
    var interactUidList: List<Int>
    @AddedIn(GI_1_4_0)
    var draftId: Int
    @AddedIn(GI_1_4_0)
    var gadgetTalkState: Int
    @AddedIn(GI_0_9_0)
    var playInfo: GadgetPlayInfo

    @OneOf(
        OneOfEntry(Item::class, "trifle_item", removedIn = GI_4_0_0),
        OneOfEntry(Int::class, "item_id", removedIn = GI_CB2),
        OneOfEntry(GatherGadgetInfo::class, "gather_gadget", addedIn = GI_CB2),
        OneOfEntry(WorktopInfo::class, "worktop"),
        OneOfEntry(ClientGadgetInfo::class, "client_gadget"),
        OneOfEntry(PlatformInfo::class, "platform", removedIn = GI_1_3_0),
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
        OneOfEntry(FishPoolInfo::class, "fish_pool_info", addedIn = GI_2_1_0),
        OneOfEntry(CustomGadgetTreeInfo::class, "custom_gadget_tree_info", addedIn = GI_2_2_0),
        OneOfEntry(RoguelikeGadgetInfo::class, "roguelike_gadget_info", addedIn = GI_2_2_0),
        OneOfEntry(NightCrowGadgetInfo::class, "night_crow_gadget_info", addedIn = GI_2_8_0),
        OneOfEntry(DeshretObeliskGadgetInfo::class, "deshret_obelisk_gadget_info", addedIn = GI_3_0_0),
        OneOfEntry(CoinCollectOperatorInfo::class, "coin_collect_operator_info", addedIn = GI_3_3_0),
        OneOfEntry(TrifleGadget::class, "trifle_gadget", addedIn = GI_4_0_0),
    )
    var content: OneOfType
}
