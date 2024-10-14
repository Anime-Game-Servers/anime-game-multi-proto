package org.anime_game_servers.multi_proto.gi.data.city_reputation.bounty

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface GetCityHuntingOfferRsp {
    var retcode: Retcode
    var cityId: Int
    var curWeekFinishedCount: Int
    var huntingOfferList: List<HuntingOfferData>
    var nextRefreshTime: Int
    var ongoingHuntingPair: HuntingPair
}
