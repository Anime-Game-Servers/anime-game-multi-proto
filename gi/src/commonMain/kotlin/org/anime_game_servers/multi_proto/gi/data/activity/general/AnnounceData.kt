package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface AnnounceData {
    var beginTime: Int
    var centerSystemFrequency: Int
    var centerSystemText: String
    var configId: Int
    var countDownFrequency: Int
    var countDownText: String
    var dungeonConfirmText: String
    var endTime: Int
    @AddedIn(GI_1_1_0)
    var isCenterSystemLast5EveryMinutes: Boolean
}
