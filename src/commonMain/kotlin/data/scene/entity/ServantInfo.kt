package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB2)
@ProtoModel
internal interface ServantInfo {
    var masterEntityId: Int
    var bornSlotIndex: Int
}
