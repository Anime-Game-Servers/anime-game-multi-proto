package data.scene

import annotations.AddedIn
import data.scene.entity.SceneEntityInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneEntityAppearNotify {
    var appearType : VisionType
    var param : Int
    var entityList : List<SceneEntityInfo>
}