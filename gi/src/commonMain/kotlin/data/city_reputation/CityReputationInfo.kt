package data.city_reputation

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface CityReputationInfo {
    var exp: Int
    var exploreInfo: CityReputationExploreInfo
    var huntInfo: CityReputationHuntInfo
    var level: Int
    var nextRefreshTime: Int
    var questInfo: CityReputationQuestInfo
    var requestInfo: CityReputationRequestInfo
    var takenLevelRewardList: List<Int>
    var totalAcceptRequestNum: Int
}
