package org.anime_game_servers.multi_proto.gi.data.community.blocking

import org.anime_game_servers.multi_proto.gi.data.community.friends.FriendBrief
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_1_0_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetPlayerBlacklistRsp {
    var retCode: Retcode
    var blacklist: List<FriendBrief>
}