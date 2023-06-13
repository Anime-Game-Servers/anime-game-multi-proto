package data.gadget

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorktopOptionNotify {
    var gadgetEntityId: Int
    @RemovedIn(VERSION.VCB2)
    var optionId: Int
    @AddedIn(VERSION.VCB2)
    var optionIdList: List<Int>
}