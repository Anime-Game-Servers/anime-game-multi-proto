package data.scene

import annotations.AddedIn
import data.scene.entity.SceneEntityInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V1_6_0

@AddedIn(V1_6_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarChangeCostumeNotify {
    var entityInfo : SceneEntityInfo
}