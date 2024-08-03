package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@ProtoCommand(RESPONSE)
internal interface SetFriendRemarkNameRsp {
    var remarkName: String
    var retcode: Int
    var uid: Int
    @AddedIn(GI_2_2_0)
    var isClearRemark: Boolean
}
