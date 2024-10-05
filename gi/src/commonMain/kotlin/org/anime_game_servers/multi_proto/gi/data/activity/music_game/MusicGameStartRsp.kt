package org.anime_game_servers.multi_proto.gi.data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_2_2_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface MusicGameStartRsp {
    var musicBasicId: Int
    var retcode: Retcode
    @AddedIn(Version.GI_2_7_0)
    var ugcGuid: Long
}