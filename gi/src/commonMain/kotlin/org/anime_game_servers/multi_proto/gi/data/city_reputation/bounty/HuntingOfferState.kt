package org.anime_game_servers.multi_proto.gi.data.city_reputation.bounty

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum
internal enum class HuntingOfferState {
    HUNTING_OFFER_STATE_NONE,
    HUNTING_OFFER_STATE_STARTED,
    HUNTING_OFFER_STATE_UNSTARTED,
    HUNTING_OFFER_STATE_SUCC,
}
