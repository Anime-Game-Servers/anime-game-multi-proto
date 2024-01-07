package data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.NOTIFY)
interface SummerTimeFloatSignalUpdateNotify {
    var floatSignalId: Int
    var position: Vector
    var isTransferAnchor: Boolean
}