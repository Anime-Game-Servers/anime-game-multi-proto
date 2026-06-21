package org.anime_game_servers.multi_proto.gi.data.other.logging

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

/**
 * Send by the server containing some log info it seems
 */
@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface ServerLogNotify {
    var logLevel: ServerLogLevel
    var logType: ServerLogType
    var serverLog: String
}
