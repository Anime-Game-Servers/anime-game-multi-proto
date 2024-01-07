package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_7_0)
@ProtoModel
internal interface EntityClientExtraInfo {
    var skillAnchorPosition: Vector
}
