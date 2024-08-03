package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface ItemAddHintNotify {
    var isPositionValid: Boolean
    var itemList: List<org.anime_game_servers.multi_proto.gi.data.item.ItemHint>
    var position: Vector
    var questId: Int
    var reason: Int
    @AddedIn(GI_1_1_0)
    var isTransferedFromAvatarCard: Boolean
    @AddedIn(GI_1_4_0)
    var overflowTransformedItemList: List<org.anime_game_servers.multi_proto.gi.data.item.ItemHint>
    @AddedIn(GI_2_0_0) @AltName("isGeneralRewardHiden")
    var isGeneralRewardHidden: Boolean
}
