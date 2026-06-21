package org.anime_game_servers.multi_proto.gi.data.quest.giving

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface ItemGivingReq {
    var givingId: Int
    var itemParamList: List<ItemParam>
    @AddedIn(GI_0_9_0)
    var itemGuidCountMap: Map<Long, Int>
    // TODO this was removed somewhere between 4.1.0 and 4.5.0
    @AddedIn(GI_2_8_0) @RemovedIn(GI_4_5_0)
    var itemGivingType: ItemGivingType
}
