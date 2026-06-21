package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(CLIENT)
internal interface ReportTrackingIOInfoNotify {
    var appid: String
    var clientTz: String
    var deviceid: String
    var mac: String
    var rydevicetype: String
}
