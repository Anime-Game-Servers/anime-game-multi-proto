package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface IrodoriFlowerData {
    var finishedThemeList: List<Int>
    var usedFlowerList: List<ItemParam>
}
