package data.player

import annotations.AddedIn
import data.general.PropValue
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerDataNotify {
    var serverTime: Long
    var nickName: String
    var propMap: Map<Int, PropValue>
    @AddedIn(VERSION.VCB2)
    var isFirstLoginToday: Boolean
    @AddedIn(VERSION.VCB2)
    var regionId: Int
}