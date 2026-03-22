package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ClientReconnectReason {
    @AltName("CLIENT_RECONNECT_REASON_NONE")
    CLIENT_RECONNNECT_NONE,
    @AltName("CLIENT_RECONNECT_REASON_QUIT_MP")
    CLIENT_RECONNNECT_QUIT_MP,
}
