package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ClientInputType

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface LanternProjectionInfo {
    var levelList: List<org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite.LanternProjectionLevelInfo>
    var openStageList: List<Int>
    var viewInputTipsList: List<ClientInputType>
    var viewSwitchTipsList: List<ClientInputType>
}
