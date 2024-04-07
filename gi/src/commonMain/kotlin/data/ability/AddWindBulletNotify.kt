package data.ability

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel(parentClass = "WindSeedClientNotify")
internal interface AddWindBulletNotify {
    var catchPlayerUid: Int
    var seedEntityId: Int
    var seedPos: Vector
}
