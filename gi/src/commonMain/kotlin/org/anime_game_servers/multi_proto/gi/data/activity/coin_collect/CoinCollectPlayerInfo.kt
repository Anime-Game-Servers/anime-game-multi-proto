package org.anime_game_servers.multi_proto.gi.data.activity.coin_collect

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface CoinCollectPlayerInfo {
    var avatarInfoList: List<CoinCollectTeamAvatarInfo>
    var chooseSkillNo: Int
    var isPrepare: Boolean
    var playerName: String
    var playerUid: Int
}
