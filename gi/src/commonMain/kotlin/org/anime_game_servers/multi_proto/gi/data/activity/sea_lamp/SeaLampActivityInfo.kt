package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
interface SeaLampActivityInfo {
    var dayIndex: Int
    var firstDayStartTime: Int
    var isContentClosed: Boolean
    var isMechanicusFeatureClosed: Boolean
    var isMechanicusOpen: Boolean
    var mechanicusId: Int
    var popularity: Int
    var seaLampCoin: Int
    var sectionInfoList: List<SeaLampSectionInfo>
}