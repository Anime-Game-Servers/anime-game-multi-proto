package org.anime_game_servers.multi_proto.gi.data.other.logging

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ServerLogType {
    @AltName("SERVER_LOG_TYPE_NONE")
    SERVER_LOG_NONE,
    @AltName("SERVER_LOG_TYPE_ABILITY")
    SERVER_LOG_ABILITY,
    @AltName("SERVER_LOG_TYPE_LEVEL")
    SERVER_LOG_LEVEL,
    @AltName("SERVER_LOG_TYPE_ENTITY")
    SERVER_LOG_ENTITY,
    @AddedIn(GI_1_2_0)
    @AltName("SERVER_LOG_TYPE_LUA")
    SERVER_LOG_LUA,
}
