package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_3_3_0)
@ProtoCommand(NOTIFY)
internal interface BrickBreakerSettleNotify {
    var combo: Int
    var galleryId: Int
    var isDungeon: Boolean
    var isNewRecord: Boolean
    var isSingleMode: Boolean
    var levelId: Int
    var reason: SettleReason
    var score: Int
    var time: Int
    var updateSkillList: List<Uint32Pair>
}
