package data.activity.salesman

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_0_0)
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