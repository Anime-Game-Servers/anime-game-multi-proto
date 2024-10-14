package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BrickBreakerPlayerBattleInfo {
    var avatarId: List<Int>
    var costumeId: List<Int>
    var isChanging: Boolean
    var isReady: Boolean
    var nickname: String
    var skillList: List<Int>
    var uid: Int
}
