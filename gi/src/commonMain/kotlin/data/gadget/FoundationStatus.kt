package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_3_0)
@ProtoEnum
enum class FoundationStatus {
    FOUNDATION_STATUS_NONE,
    FOUNDATION_STATUS_INIT,
    FOUNDATION_STATUS_BUILDING,
    FOUNDATION_STATUS_BUILT,
}