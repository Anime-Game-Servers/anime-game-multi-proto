package org.anime_game_servers.multi_proto.gi.data.community.player_presentation

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_3_0)
@ProtoCommand(RESPONSE)
internal interface UpdatePlayerShowAvatarListRsp {
    var isShowAvatar: Boolean
    var retcode: Int
    var showAvatarIdList: List<Int>
}
