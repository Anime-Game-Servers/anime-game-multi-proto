package data.scene

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneTeamUpdateNotify {
    var sceneTeamAvatarList : List<SceneTeamAvatar>
    var isInMp : Boolean
    @RemovedIn(VERSION.V1_0_0)
    var displayCurAvatarList : List<MPDisplayCurAvatar>
}