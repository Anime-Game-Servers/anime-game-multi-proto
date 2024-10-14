package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_2_0)
@ProtoCommand(RESPONSE)
internal interface SetFriendRemarkNameRsp {
    var retcode: Retcode
    var remarkName: String
    var uid: Int
    @AddedIn(GI_2_2_0)
    var isClearRemark: Boolean
}
