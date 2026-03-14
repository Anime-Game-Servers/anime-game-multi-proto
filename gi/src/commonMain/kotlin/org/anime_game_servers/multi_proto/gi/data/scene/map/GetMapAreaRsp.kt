package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@ProtoCommand(RESPONSE)
internal interface GetMapAreaRsp {
    var mapAreaInfoList: List<MapAreaInfo>
    var retcode: Retcode
}