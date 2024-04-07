package data.general.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface MassiveBoxInfo {
    var center: Vector
    @AltName("configid")
    var configId: Int
    var extents: Vector
    var forward: Vector
    var id: Int
    var right: Vector
    var up: Vector
}
