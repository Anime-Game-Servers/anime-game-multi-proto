package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
internal interface BossChestInfo {
    var monsterConfigId: Int
    var resin: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>
    @AddedIn(Version.GI_1_5_0)
    var uidDiscountMap: Map<Int, org.anime_game_servers.multi_proto.gi.data.scene.entity.WeeklyBossResinDiscountInfo>
}
