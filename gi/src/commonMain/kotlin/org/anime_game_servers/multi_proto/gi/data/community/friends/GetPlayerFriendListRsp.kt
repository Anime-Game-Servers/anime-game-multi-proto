package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface GetPlayerFriendListRsp {
    var askFriendList: List<FriendBrief>
    @RemovedIn(GI_1_0_0)
    var blacklist: List<FriendBrief>
    var friendList: List<FriendBrief>
    var retcode: Int
}
