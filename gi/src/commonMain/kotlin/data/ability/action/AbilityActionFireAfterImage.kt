package data.ability.action

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel("AbilityActionFireAfterImgae")
internal interface AbilityActionFireAfterImage {
    var dir: Vector
}
