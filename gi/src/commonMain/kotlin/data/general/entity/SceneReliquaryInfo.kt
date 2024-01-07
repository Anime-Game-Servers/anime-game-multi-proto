package data.general.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneReliquaryInfo {
    var itemId: Int
    var guid: Long
    var level: Int
    var promoteLevel: Int
}