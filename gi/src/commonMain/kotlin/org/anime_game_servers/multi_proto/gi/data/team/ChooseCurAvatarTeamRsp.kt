package org.anime_game_servers.multi_proto.gi.data.team

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ChooseCurAvatarTeamRsp {
    var retcode: Retcode
    @AddedIn(GI_CB1)
    @RemovedIn(GI_CB2)
    var avatarEntityIdMap: Map<Long, Int>
    var curTeamId: Int
}
