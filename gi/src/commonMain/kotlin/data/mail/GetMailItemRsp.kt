package data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.EquipParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE)
interface GetMailItemRsp {
    var mailIdList: List<Int>
    var itemList: List<EquipParam>
    var retCode: Int
}