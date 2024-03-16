package data.scene

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

// TODO might be send by the client to the server verify directions used
@AddedIn(GI_2_4_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface LevelTagDataNotify {
    var levelTagIdList : List<String>
}
