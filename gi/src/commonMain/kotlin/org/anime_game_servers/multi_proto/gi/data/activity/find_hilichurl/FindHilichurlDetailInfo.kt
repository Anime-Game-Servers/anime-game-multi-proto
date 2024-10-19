package org.anime_game_servers.multi_proto.gi.data.activity.find_hilichurl

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface FindHilichurlDetailInfo {
    var contentCloseTime: Int
    var dayContentInfoList: List<FindHilichurlDayContentInfo>
    var dayIndex: Int
    var isContentClosed: Boolean
    var isEndQuestAccept: Boolean
    var minOpenPlayerLevel: Int
    var playerDayIndex: Int
}
