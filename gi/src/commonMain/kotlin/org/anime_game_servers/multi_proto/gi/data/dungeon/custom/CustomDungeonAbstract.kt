package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface CustomDungeonAbstract {
    var brickStatisticsMap: Map<Int, Int>
    var finishRoomId: Int
    var firstPublishTime: Int
    var lastPublishTime: Int
    var totalCoinNum: Int
}
