package data.scene

import annotations.AddedIn
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB1
import messages.VERSION.VCB2

@AddedIn(VCB1)
@ProtoModel
internal interface ScenePlayerInfo {
    var uid: Int
    var peerId: Int
    var name: String
    var isConnected: Boolean
    @AddedIn(VCB2)
    var sceneId: Int
    @AddedIn(VCB2)
    var onlinePlayerInfo: OnlinePlayerInfo
}
