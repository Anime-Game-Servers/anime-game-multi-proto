package org.anime_game_servers.multi_proto.gi.data.activity.water_spirit.region_search

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum
internal enum class RegionSearchState {
    @AltName("REGION_SEARCH_STATE_NONE")
    REGION_SEARCH_NONE,
    @AltName("REGION_SEARCH_STATE_UNSTARTED")
    REGION_SEARCH_UNSTARTED,
    @AltName("REGION_SEARCH_STATE_STARTED")
    REGION_SEARCH_STARTED,
    @AltName("REGION_SEARCH_STATE_WAIT_REWARD")
    REGION_SEARCH_WAIT_REWARD,
    @AltName("REGION_SEARCH_STATE_FINISHED")
    REGION_SEARCH_FINISHED,
}
