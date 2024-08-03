package org.anime_game_servers.multi_proto.gi.data.team.avatar

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface AddNoGachaAvatarCardNotify {
    var avatarId: Int
    var initialLevel: Int
    var initialPromoteLevel: Int
    var isTransferToItem: Boolean
    var itemId: Int
    var reason: Int
    var transferItemList: List<AddNoGachaAvatarCardTransferItem>
}
