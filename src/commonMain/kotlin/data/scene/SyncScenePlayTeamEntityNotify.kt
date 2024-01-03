package data.scene

import annotations.AddedIn
import data.scene.entity.PlayTeamEntityInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface SyncScenePlayTeamEntityNotify {
    var sceneId : Int
    var entityInfoList : List<PlayTeamEntityInfo>
}