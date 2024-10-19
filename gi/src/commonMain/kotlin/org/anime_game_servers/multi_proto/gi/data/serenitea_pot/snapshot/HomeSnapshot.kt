package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.snapshot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@RemovedIn(GI_2_1_0)
@ProtoModel
internal interface HomeSnapshot {
    var basicSnapshot: HomeBasicCompSnapshot
    var sceneSnapshot: HomeSceneCompSnapshot
}
