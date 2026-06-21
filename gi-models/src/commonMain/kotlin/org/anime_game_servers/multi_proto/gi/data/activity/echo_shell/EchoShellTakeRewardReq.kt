package org.anime_game_servers.multi_proto.gi.data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(REQUEST)
internal interface EchoShellTakeRewardReq {
    var rewardId: Int
}
