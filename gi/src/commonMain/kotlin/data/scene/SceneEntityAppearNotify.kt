package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.scene.entity.SceneEntityInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneEntityAppearNotify {
    var appearType : VisionType
    var param : Int
    var entityList : List<SceneEntityInfo>
}