package org.anime_game_servers.multi_proto.gi.data.gallery.bounce_conjuring

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ExhibitionDisplayInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface BounceConjuringGallerySettleInfo {
    var cardList: List<ExhibitionDisplayInfo>
    var damage: Float
    var destroyedMachineCount: Int
    var feverCount: Int
    var gadgetCountMap: Map<Int, Int>
    var normalHitCount: Int
    var perfectHitCount: Int
    var playerInfo: OnlinePlayerInfo
    var score: Int
}
