package org.anime_game_servers.multi_proto.gi.data.community.friends.management

import org.anime_game_servers.multi_proto.gi.data.community.friends.FriendBrief
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(RESPONSE)
internal interface ForceAddPlayerFriendRsp {
    var retcode: Int
    var targetUid: Int
    @AddedIn(GI_2_5_0)
    var targetFriendBrief: FriendBrief
}