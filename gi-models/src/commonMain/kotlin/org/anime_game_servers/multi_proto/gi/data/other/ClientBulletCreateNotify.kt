package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

/**
 * Just makes an anticheat check
 */
@AddedIn(GI_2_1_0)
@ProtoCommand(CLIENT)
internal interface ClientBulletCreateNotify {
    var param: Int
}
