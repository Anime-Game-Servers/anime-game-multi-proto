package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface ClientGadgetInfo {
    var campId: Int
    var campType: Int
    var guid: Long
    var ownerEntityId: Int
    var targetEntityId: Int
    var asyncLoad: Boolean
    @AddedIn(VERSION.V2_4_0)
    var isPeerIdFromPlayer: Boolean
    @AddedIn(VERSION.V2_7_0)
    var targetEntityIdList: List<Int>
}
