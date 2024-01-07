package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface GatherGadgetInfo {
    var itemId: Int
    var isForbidGuest: Boolean
}
