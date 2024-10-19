package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_5_0)
@ProtoEnum
enum class FriendEnterHomeOption {
    FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM,
    FRIEND_ENTER_HOME_OPTION_REFUSE,
    FRIEND_ENTER_HOME_OPTION_DIRECT,
}