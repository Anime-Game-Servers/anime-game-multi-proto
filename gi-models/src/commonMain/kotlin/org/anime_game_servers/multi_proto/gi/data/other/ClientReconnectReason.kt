package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_4_2_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
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
    @AddedIn(GI_4_5_0) // TODO verify 4.3-4.4
    @AltName("CLIENT_RECONNECT_REASON_")
    CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL,
    @AddedIn(GI_4_5_0) // TODO verify 4.3-4.4
    @AltName("CLIENT_RECONNECT_REASON_")
    CLIENT_RECONNNECT_ENTER_QUEST_FOCUS,
}
