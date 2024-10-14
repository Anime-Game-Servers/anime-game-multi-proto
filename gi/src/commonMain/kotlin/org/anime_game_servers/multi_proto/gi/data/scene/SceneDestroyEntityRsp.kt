package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface SceneDestroyEntityRsp {
    var retCode: Retcode
    var entityId: Int
}