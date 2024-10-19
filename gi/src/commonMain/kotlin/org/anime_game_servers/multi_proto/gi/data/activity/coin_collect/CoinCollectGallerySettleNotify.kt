package org.anime_game_servers.multi_proto.gi.data.activity.coin_collect

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_3_0)
@ProtoCommand(NOTIFY)
internal interface CoinCollectGallerySettleNotify {
    var isNewRecord: Boolean
    var levelId: Int
    var multistagePlayIndex: Int
    var coinCollectNum: Int
    var coinCollectTime: Int
    var coinTotalNum: Int
}
