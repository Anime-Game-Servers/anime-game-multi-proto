package data.mail

import annotations.AddedIn
import data.general.Item.EquipParam
import messages.VERSION
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.RESPONSE)
interface DelMailRsp {
    var mailIdList: List<Int>
    var retCode: Int
}