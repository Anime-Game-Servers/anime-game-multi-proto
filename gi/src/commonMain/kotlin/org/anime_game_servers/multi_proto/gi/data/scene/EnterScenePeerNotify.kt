package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
interface EnterScenePeerNotify {
    var destSceneId : Int
    var peerId : Int
    var hostPeerId : Int
    @AddedIn(Version.GI_1_0_0)
    var enterSceneToken : Int
}