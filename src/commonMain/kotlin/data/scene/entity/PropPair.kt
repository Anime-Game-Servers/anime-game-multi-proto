package data.scene.entity

import annotations.AddedIn
import data.general.PropValue
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_0_0)
@ProtoModel
internal interface PropPair {
    var type: Int
    var propValue: PropValue
}
