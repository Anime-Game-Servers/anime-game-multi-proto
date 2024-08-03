package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface Reward {
    var itemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var rewardId: Int
}
