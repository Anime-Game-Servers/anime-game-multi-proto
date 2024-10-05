package org.anime_game_servers.multi_proto.gi.data.activity.bartender

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface BartenderActivityDetailInfo {
    var isContentClosed: Boolean
    var isDevelopModuleOpen: Boolean
    var unlockFormulaList: List<Int>
    var unlockItemList: List<Int>
    var unlockLevelList: List<org.anime_game_servers.multi_proto.gi.data.activity.bartender.BartenderLevelInfo>
    var unlockTaskList: List<org.anime_game_servers.multi_proto.gi.data.activity.bartender.BartenderTaskInfo>
}
