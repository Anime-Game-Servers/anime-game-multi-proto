package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface ScenePlayerLocationNotify {
    var sceneId : Int
    var playerLocList : List<org.anime_game_servers.multi_proto.gi.data.scene.PlayerLocationInfo>
    @AddedIn(GI_1_6_0)
    var vehicleLocList : List<org.anime_game_servers.multi_proto.gi.data.scene.VehicleLocationInfo>
}