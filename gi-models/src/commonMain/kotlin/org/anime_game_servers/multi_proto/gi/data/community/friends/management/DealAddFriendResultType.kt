package org.anime_game_servers.multi_proto.gi.data.community.friends.management

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class DealAddFriendResultType {
    @AltName("DEAL_ADD_FRIEND_RESULT_TYPE_REJECT")
    DEAL_ADD_FRIEND_REJECT,
    @AltName("DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT")
    DEAL_ADD_FRIEND_ACCEPT,
}
