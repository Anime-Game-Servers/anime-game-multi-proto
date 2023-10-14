package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface ActivityShopSheetInfo {
    var sheetId: Int
    var beginTime: Int
    var endTime: Int
}