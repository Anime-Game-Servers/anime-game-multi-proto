package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
interface SeaLampActivityInfo {
    var dayIndex: Int
    var popularity: Int
    var seaLampCoin: Int
    var isContentClosed: Boolean
    var sectionInfoList: List<SeaLampSectionInfo>
    var mechanicusId: Int
    var isMechanicusOpen: Boolean
    var firstDayStartTime: Int
    var isMechanicusFeatureClosed: Boolean
}