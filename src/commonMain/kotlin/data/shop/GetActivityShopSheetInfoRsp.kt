package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_1_0)
@ProtoCommand(CommandType.RESPONSE)
interface GetActivityShopSheetInfoRsp {
    var retcode: Int
    var shopType: Int
    var sheetInfoList: List<ActivityShopSheetInfo>
}