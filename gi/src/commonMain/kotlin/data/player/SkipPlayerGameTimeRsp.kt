package data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_3_4_0)
@ProtoCommand(CommandType.RESPONSE)
interface SkipPlayerGameTimeRsp {
    var clientGameTime: Int
    var gameTime: Int
    var retCode: Int
}