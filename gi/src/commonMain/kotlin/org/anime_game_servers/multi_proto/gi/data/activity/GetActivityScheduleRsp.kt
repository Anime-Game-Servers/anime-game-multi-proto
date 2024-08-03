package org.anime_game_servers.multi_proto.gi.data.activity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.RESPONSE)
interface GetActivityScheduleRsp {
    var activityScheduleList: List<ActivityScheduleInfo>
    var remainingFlySeaLampNum: Int
    var retcode: Int
}