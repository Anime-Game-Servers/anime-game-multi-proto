package org.anime_game_servers.multi_proto.gi.data.activity.water_spirit.region_search

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum("RegionSearchChangeRegionNotify")
internal enum class RegionEvent {
    REGION_EVENT_NONE,
    REGION_EVENT_ENTER,
    REGION_EVENT_LEAVE,
}
