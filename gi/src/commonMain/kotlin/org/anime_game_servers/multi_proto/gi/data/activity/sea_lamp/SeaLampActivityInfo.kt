package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
@ProtoModel
interface SeaLampActivityInfo {
    var dayIndex: Int
    var popularity: Int
    var seaLampCoin: Int
    var isContentClosed: Boolean
    var sectionInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.SeaLampSectionInfo>
    var mechanicusId: Int
    var isMechanicusOpen: Boolean
    var firstDayStartTime: Int
    var isMechanicusFeatureClosed: Boolean
}