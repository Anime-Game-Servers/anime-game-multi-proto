package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetPlayStopNotify {
    var playType: Int
    var entityId: Int
    var isWin: Boolean
    var costTime: Int
    var uidInfoList: List<GadgetPlayUidInfo>
    var score: Int
}