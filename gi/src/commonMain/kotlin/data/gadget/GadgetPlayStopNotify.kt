package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetPlayStopNotify {
    var playType: Int
    var entityId: Int
    var isWin: Boolean
    var costTime: Int
    var uidInfoList: List<GadgetPlayUidInfo>
    var score: Int
}