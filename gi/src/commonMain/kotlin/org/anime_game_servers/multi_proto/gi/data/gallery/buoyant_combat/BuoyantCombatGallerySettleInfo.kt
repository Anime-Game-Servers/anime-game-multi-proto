package org.anime_game_servers.multi_proto.gi.data.gallery.buoyant_combat

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface BuoyantCombatGallerySettleInfo {
    var finalScore: Int
    var galleryId: Int
    var galleryLevel: Int
    var galleryMultiple: Int
    var killMonsterCount: Int
    var killSpecialMonsterCount: Int
    var killTargetCount: Int
}
