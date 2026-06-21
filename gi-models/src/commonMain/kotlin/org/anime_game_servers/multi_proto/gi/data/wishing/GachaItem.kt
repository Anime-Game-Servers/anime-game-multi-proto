package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_CB2)
@ProtoModel
internal interface GachaItem {
    var gachaItem: ItemParam
    var isFlashCard: Boolean
    var isGachaItemNew: Boolean
    var transferItems: List<GachaTransferItem>
    @AddedIn(GI_0_9_0)
    var tokenItemList: List<ItemParam>
}
