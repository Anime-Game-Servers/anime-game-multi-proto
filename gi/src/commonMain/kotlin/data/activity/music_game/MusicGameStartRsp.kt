package data.activity.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_2_0)
@ProtoCommand(CommandType.RESPONSE)
interface MusicGameStartRsp {
    var musicBasicId: Int
    @AddedIn(Version.GI_2_7_0)
    var ugcGuid: Long
    var retcode: Int
}