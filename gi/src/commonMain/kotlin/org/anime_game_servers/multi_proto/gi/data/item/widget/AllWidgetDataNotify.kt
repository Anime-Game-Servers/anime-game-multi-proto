package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.item.widget.anchor_point.AnchorPointData
import org.anime_game_servers.multi_proto.gi.data.item.widget.type_avatar_attach.AttachAvatarWidgetData
import org.anime_game_servers.multi_proto.gi.data.item.widget.lunch_box.LunchBoxData
import org.anime_game_servers.multi_proto.gi.data.item.widget.manage_cooldown.WidgetCoolDownData
import org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot.WidgetSlotData
import org.anime_game_servers.multi_proto.gi.data.item.widget.one_of_gather_point_detector.OneOfGatherPointDetectorData
import org.anime_game_servers.multi_proto.gi.data.item.widget.sky_cristal_detector.SkyCrystalDetectorData

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface AllWidgetDataNotify {
    var anchorPointList: List<AnchorPointData>
    var clientCollectorDataList: List<ClientCollectorData>
    var coolDownGroupDataList: List<WidgetCoolDownData>
    var lunchBoxData: LunchBoxData
    var nextAnchorPointUsableTime: Int
    @RemovedIn(GI_2_1_0)
    var nextBonfireUsableTime: Int
    var normalCoolDownDataList: List<WidgetCoolDownData>
    @AltName("oneofGatherPointDetectorDataList","oneoffGatherPointDetectorDataList")
    var oneOfGatherPointDetectorDataList: List<OneOfGatherPointDetectorData>
    @RemovedIn(GI_1_5_0)
    var quickUseMaterialId: Int
    @AddedIn(GI_1_2_0)
    @RemovedIn(GI_1_5_0)
    var attachAvatarWidget: AttachAvatarWidgetData
    @AddedIn(GI_1_5_0)
    var slotList: List<WidgetSlotData>
    @AddedIn(GI_2_6_0)
    var skyCrystalDetectorData: SkyCrystalDetectorData
    @AddedIn(GI_3_0_0)
    var backgroundActiveWidgetList: List<Int>
}
