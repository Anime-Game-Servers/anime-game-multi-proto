package org.anime_game_servers.multi_proto.gi.data.team

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface SyncTeamEntityNotify {
    var sceneId: Int
    var teamEntityInfoList: List<TeamEntityInfo>
}