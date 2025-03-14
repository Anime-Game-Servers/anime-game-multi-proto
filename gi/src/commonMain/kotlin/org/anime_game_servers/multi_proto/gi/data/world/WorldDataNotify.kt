package org.anime_game_servers.multi_proto.gi.data.world

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.PropValue
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorldDataNotify {
    var worldPropMap: Map<Int, PropValue>
}
