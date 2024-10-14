package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface RogueStageInfo {
    var avatarTeam: RogueShowAvatarTeamInfo
    var cachedCoinBNum: Int
    var cachedCoinCNum: Int
    var coinCNum: Int
    var curLevel: Int
    var exploreCellNum: Int
    var isExplored: Boolean
    var isInCombat: Boolean
    var isOpen: Boolean
    var isPassed: Boolean
    var isTakenReward: Boolean
    var maxPassedLevel: Int
    var reviseMonsterLevel: Int
    var runeRecordList: List<RoguelikeRuneRecord>
    var stageId: Int
}
