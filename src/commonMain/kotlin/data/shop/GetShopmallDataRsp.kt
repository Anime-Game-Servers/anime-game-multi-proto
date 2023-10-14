package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetShopmallDataRsp {
    var retcode: Int
    var shopTypeList: List<Int>
}