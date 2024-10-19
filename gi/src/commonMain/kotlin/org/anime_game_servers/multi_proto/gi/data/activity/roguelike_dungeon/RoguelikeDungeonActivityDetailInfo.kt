package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface RoguelikeDungeonActivityDetailInfo {
    var contentCloseTime: Int
    var equippedRuneList: List<Int>
    var isContentClosed: Boolean
    var runeList: List<Int>
    var shikigamiList: List<RoguelikeShikigamiRecord>
    var stageList: List<RogueStageInfo>
}
