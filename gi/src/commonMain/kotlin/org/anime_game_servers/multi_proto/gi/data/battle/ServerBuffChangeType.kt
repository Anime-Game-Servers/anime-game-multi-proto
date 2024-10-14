package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum("ServerBuffChangeNotify")
internal enum class ServerBuffChangeType {
    @AltName("SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF")
    ADD_SERVER_BUFF,
    @AltName("SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF")
    DEL_SERVER_BUFF,
}
