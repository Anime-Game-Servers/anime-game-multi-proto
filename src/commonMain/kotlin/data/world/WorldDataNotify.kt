package data.world

import annotations.AddedIn
import data.general.PropValue
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorldDataNotify {
    var worldPropMap: Map<Int, PropValue>
}
