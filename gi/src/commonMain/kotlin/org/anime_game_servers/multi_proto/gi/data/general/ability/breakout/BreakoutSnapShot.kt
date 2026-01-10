package org.anime_game_servers.multi_proto.gi.data.general.ability.breakout

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BreakoutSnapShot {
    var actionList: List<BreakoutAction>
    var ballElementReactionList: List<BreakoutElementReactionCounter>
    var ballList: List<BreakoutPhysicalObject>
    var brickElementReactionList: List<BreakoutElementReactionCounter>
    var clientGameTime: Long
    var combo: Int
    var dynamicObjectList: List<BreakoutPhysicalObject>
    var idIndexList: List<Int>
    var isFinish: Boolean
    var lifeCount: Int
    var maxCombo: Int
    var physicalObjectList: List<BreakoutPhysicalObject>
    var rawClientGameTime: Int
    var remainingBossHp: Int
    var score: Int
    var serverGameTime: Long
    var spawnPointList: List<BreakoutSpawnPoint>
    var uidInfoList: List<BreakoutSyncConnectUidInfo>
    var waveIndex: Int
    var waveSuiteIndex: Int
}