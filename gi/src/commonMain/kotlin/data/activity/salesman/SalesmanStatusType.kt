package data.activity.salesman

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_0_0)
@ProtoEnum
enum class SalesmanStatusType {
    @AltName("SALESMAN_STATUS_TYPE_NONE")
    SALESMAN_STATUS_NONE,
    @AltName("SALESMAN_STATUS_TYPE_UNSTARTED")
    SALESMAN_STATUS_UNSTARTED,
    @AltName("SALESMAN_STATUS_TYPE_STARTED")
    SALESMAN_STATUS_STARTED,
    @AltName("SALESMAN_STATUS_TYPE_DELIVERED")
    SALESMAN_STATUS_DELIVERED,
}