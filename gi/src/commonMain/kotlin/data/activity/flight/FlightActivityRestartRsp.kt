package data.activity.flight

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_1_0)
@ProtoCommand(CommandType.RESPONSE)
interface FlightActivityRestartRsp {
    var scheduleId: Int
    var groupId: Int
    var retcode: Int
}