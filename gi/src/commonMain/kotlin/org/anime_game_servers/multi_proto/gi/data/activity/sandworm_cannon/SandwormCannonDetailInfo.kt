package org.anime_game_servers.multi_proto.gi.data.activity.sandworm_cannon

import org.anime_game_servers.core.base.Version.GI_3_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_6_0)
@ProtoModel
internal interface SandwormCannonDetailInfo {
    @AltName("Unk_36_JAAFEFLDPLF")
    var sandwormCannonInfo: SandwormCannonLevelData
}