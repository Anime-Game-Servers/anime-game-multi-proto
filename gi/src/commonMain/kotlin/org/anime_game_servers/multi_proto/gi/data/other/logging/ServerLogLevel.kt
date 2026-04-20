package org.anime_game_servers.multi_proto.gi.data.other.logging

import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ServerLogLevel {
    @AltName("SERVER_LOG_LEVEL_NONE")
    LOG_LEVEL_NONE,
    @AltName("SERVER_LOG_LEVEL_DEBUG")
    LOG_LEVEL_DEBUG,
    @AltName("SERVER_LOG_LEVEL_INFO")
    LOG_LEVEL_INFO,
    @AltName("SERVER_LOG_LEVEL_WARNING")
    LOG_LEVEL_WARNING,
    @AltName("SERVER_LOG_LEVEL_ERROR")
    LOG_LEVEL_ERROR,
    @AddedIn(GI_4_5_0) // TODO verify 4.3-4.4
    @AltName("SERVER_LOG_LEVEL_Red_ALERT_SILENT")
    LOG_LEVEL_RED_ALERT_SILENT,
}
