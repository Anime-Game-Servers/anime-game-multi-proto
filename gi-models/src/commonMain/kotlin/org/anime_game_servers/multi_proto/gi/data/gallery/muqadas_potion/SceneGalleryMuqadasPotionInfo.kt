package org.anime_game_servers.multi_proto.gi.data.gallery.muqadas_potion

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface SceneGalleryMuqadasPotionInfo {
    var captureWeaknessCount: Int
    var score: Int
    var skillEnergy: Int
    var skillUseLimit: Int
}
