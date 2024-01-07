package data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.PropValue
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerPropNotify {
    var propMap: Map<Int, PropValue>
}