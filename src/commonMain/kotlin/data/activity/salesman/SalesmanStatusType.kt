package data.activity.salesman

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_0_0)
@ProtoEnum
enum class SalesmanStatusType {
    SALESMAN_STATUS_NONE,
    SALESMAN_STATUS_UNSTARTED,
    SALESMAN_STATUS_STARTED,
    SALESMAN_STATUS_DELIVERED,
}