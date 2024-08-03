package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_1_0)
@ProtoCommand(CommandType.RESPONSE)
interface GetActivityShopSheetInfoRsp {
    var retcode: Int
    var shopType: Int
    var sheetInfoList: List<ActivityShopSheetInfo>
}