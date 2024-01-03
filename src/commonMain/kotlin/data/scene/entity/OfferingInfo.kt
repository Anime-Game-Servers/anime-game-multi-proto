package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_2_0)
@ProtoModel
internal interface OfferingInfo {
    var offeringId: Int
}
