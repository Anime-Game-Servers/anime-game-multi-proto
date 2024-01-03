package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_0_0)
@ProtoModel
internal interface FightPropPair {
    var propType: Int
    var propValue: Float
}
