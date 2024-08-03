package org.anime_game_servers.multi_proto.gi.data.city_reputation

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface CityReputationInfo {
    var exp: Int
    var exploreInfo: org.anime_game_servers.multi_proto.gi.data.city_reputation.CityReputationExploreInfo
    var huntInfo: org.anime_game_servers.multi_proto.gi.data.city_reputation.CityReputationHuntInfo
    var level: Int
    var nextRefreshTime: Int
    var questInfo: org.anime_game_servers.multi_proto.gi.data.city_reputation.CityReputationQuestInfo
    var requestInfo: org.anime_game_servers.multi_proto.gi.data.city_reputation.CityReputationRequestInfo
    var takenLevelRewardList: List<Int>
    var totalAcceptRequestNum: Int
}
