package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface IrodoriPoetryThemeData {
    var lineIdList: List<Int>
    var maxProgress: Int
    var minProgress: Int
    var progress: Int
    var scannedIndexList: List<Int>
    var selectedLineId: Int
    var themeId: Int
}
