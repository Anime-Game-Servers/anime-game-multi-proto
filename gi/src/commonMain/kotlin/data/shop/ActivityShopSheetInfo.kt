package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface ActivityShopSheetInfo {
    var sheetId: Int
    var beginTime: Int
    var endTime: Int
}