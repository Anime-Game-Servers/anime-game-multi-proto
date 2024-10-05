package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(NOTIFY)
internal interface EnterRoguelikeDungeonNotify {
    var backstageAvatarGuidList: List<Long>
    var bonusResourceProp: Float
    var cellInfoMap: Map<Int, org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon.RogueCellInfo>
    var curCellId: Int
    var curLevel: Int
    var dungeonId: Int
    var dungeonWeightConfigId: Int
    var exploredCellList: List<Int>
    var isFirstEnter: Boolean
    var isMistClear: Boolean
    var onstageAvatarGuidList: List<Long>
    var refreshCostItemCount: Int
    var refreshCostItemId: Int
    var reviseMonsterLevel: Int
    var runeRecordList: List<org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon.RoguelikeRuneRecord>
    var stageId: Int
}
