package org.anime_game_servers.multi_proto.gi.data.other.security

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface SegmentCRCInfo {
    var retcode: Retcode
    var crc: String
    var module: Int
    var offset: Int
    var size: Int
}
