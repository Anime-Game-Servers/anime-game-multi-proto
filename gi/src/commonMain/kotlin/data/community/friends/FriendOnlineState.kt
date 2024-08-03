package data.community.friends

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_0_9_0)
@ProtoEnum
enum class FriendOnlineState {
    @AltName("FREIEND_DISCONNECT","FREIEND_ONLINE_STATE_DISCONNECT","FRIEND_ONLINE_STATE_DISCONNECT")
    FRIEND_DISCONNECT,
    @AltName("FRIEND_ONLINE_STATE_ONLINE")
    FRIEND_ONLINE,
}