package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneTeamUpdateNotify {
    var sceneTeamAvatarList : List<SceneTeamAvatar>
    var isInMp : Boolean
    @RemovedIn(Version.GI_1_0_0)
    var displayCurAvatarList : List<MPDisplayCurAvatar>
}