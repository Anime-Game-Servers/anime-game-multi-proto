package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface ClientGadgetInfo {
    var campId: Int
    var campType: Int
    var guid: Long
    var ownerEntityId: Int
    var targetEntityId: Int
    var asyncLoad: Boolean
    @AddedIn(Version.GI_2_4_0)
    var isPeerIdFromPlayer: Boolean
    @AddedIn(Version.GI_2_7_0)
    var targetEntityIdList: List<Int>
}
