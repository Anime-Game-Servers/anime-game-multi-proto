package data.ability.mixin

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface AbilityMixinShootFromCamera {
    var forward: Vector
    var initPos: Vector
}
