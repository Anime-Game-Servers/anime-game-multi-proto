package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface ActivityDisableTransferPointInteractionNotify {
    var isDisable: Boolean
    var scenePointPair: Uint32Pair
}
