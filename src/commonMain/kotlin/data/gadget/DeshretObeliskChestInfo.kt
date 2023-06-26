package data.gadget

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V3_0_0)
@ProtoModel
interface DeshretObeliskChestInfo {
    var sceneId: Int
    var groupId: Int
    var pos: Vector
    var configId: Int
}