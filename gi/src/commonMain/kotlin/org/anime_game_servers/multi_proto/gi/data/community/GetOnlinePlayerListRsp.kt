package org.anime_game_servers.multi_proto.gi.data.community

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetOnlinePlayerListRsp {
    var retCode: Retcode
    var playerInfoList: List<OnlinePlayerInfo>
    @AddedIn(Version.GI_1_1_0)
    var param: Int
}