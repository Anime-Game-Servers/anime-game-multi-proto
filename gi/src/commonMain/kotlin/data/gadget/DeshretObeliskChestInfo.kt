package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_0_0)
@ProtoModel
interface DeshretObeliskChestInfo {
    var sceneId: Int
    var groupId: Int
    var pos: Vector
    var configId: Int
}