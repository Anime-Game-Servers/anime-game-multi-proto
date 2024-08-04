package org.anime_game_servers.multi_proto.gi.data.activity.crystal_link

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface CrystalLinkDungeonSettleInfo {
    var difficultyId: Int
    var finalScore: Int
    var isNewRecord: Boolean
    var killEliteMonsterNum: Int
    @AltName("killNormalMonsterNum")
    var killNormalMosnterNum: Int
    var levelId: Int
}
