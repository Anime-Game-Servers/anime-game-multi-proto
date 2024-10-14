package org.anime_game_servers.multi_proto.gi.data.world.investigation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.multi_proto.gi.data.scene.entity.WeeklyBossResinDiscountInfo

@AddedIn(GI_CB2)
@ProtoModel
internal interface InvestigationMonster {
    var cityId: Int
    var id: Int
    var isAlive: Boolean
    var level: Int
    var lockState: LockState
    var nextRefreshTime: Int
    var pos: Vector
    var refreshInterval: Int
    @AddedIn(GI_0_9_0)
    var bossChestNum: Int
    @AddedIn(GI_0_9_0)
    var maxBossChestNum: Int
    @AddedIn(GI_0_9_0)
    var resin: Int
    @AddedIn(GI_1_1_0)
    var isAreaLocked: Boolean
    @AddedIn(GI_1_2_0)
    var nextBossChestRefreshTime: Int
    @AddedIn(GI_1_5_0)
    var weeklyBossResinDiscountInfo: WeeklyBossResinDiscountInfo
    @AddedIn(GI_1_6_0)
    var groupId: Int
    @AddedIn(GI_1_6_0)
    var monsterId: Int
    @AddedIn(GI_1_6_0)
    var sceneId: Int
}
