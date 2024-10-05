package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_3_0)
@ProtoCommand(RESPONSE)
internal interface ExpeditionStartRsp {
    var assistAvatarId: Int
    var assistUid: Int
    var avatarIdList: List<Int>
    var pathId: Int
    var retcode: Retcode
}
