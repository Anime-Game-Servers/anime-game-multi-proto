package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface IrodoriActivityDetailInfo {
    var chessData: org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess.IrodoriChessData
    var flowerData: org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess.IrodoriFlowerData
    var masterLevelList: List<org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess.IrodoriMasterLevelInfo>
    var poetryData: org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess.IrodoriPoetryData
}
