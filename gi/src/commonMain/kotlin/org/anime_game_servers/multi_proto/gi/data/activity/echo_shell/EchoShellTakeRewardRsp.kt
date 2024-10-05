package org.anime_game_servers.multi_proto.gi.data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_6_0)
@ProtoCommand(RESPONSE)
internal interface EchoShellTakeRewardRsp {
    var rewardId: Int
    var retcode: Retcode
}