package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.avatar

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

/**
 * Also check out [HomeAvatarAllFinishRewardNotify]
 */
@AddedIn(GI_1_6_0)
@ProtoCommand(NOTIFY)
internal interface HomeAvtarAllFinishRewardNotify {
    var eventIdList: List<Int>
}
