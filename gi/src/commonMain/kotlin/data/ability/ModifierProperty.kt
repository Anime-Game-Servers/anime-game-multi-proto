package data.ability

import data.general.ability.AbilityString
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface ModifierProperty {
    var key: AbilityString
    var value: Float
}
