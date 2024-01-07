package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2

@AddedIn(GI_CB1)
@ProtoModel
internal interface ScenePlayerInfo {
    var uid: Int
    var peerId: Int
    var name: String
    var isConnected: Boolean
    @AddedIn(GI_CB2)
    var sceneId: Int
    @AddedIn(GI_CB2)
    var onlinePlayerInfo: OnlinePlayerInfo
}
