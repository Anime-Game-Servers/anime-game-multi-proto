package data.team

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface SyncTeamEntityNotify {
    var sceneId: Int
    var teamEntityInfoList: List<TeamEntityInfo>
}