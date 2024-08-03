package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerEnterSceneNotify {
    var sceneId : Int
    var pos : Vector
    var sceneBeginTime : Long
    var type : org.anime_game_servers.multi_proto.gi.data.scene.EnterType
    var targetUid : Int
    var prevSceneId : Int
    var prevPos : Vector
    var dungeonId : Int
    @AddedIn(GI_CB2)
    var worldLevel : Int
    @AddedIn(GI_0_9_0)
    var enterSceneToken : Int
    @AddedIn(GI_1_0_0)
    var isFirstLoginEnterScene : Boolean
    @AddedIn(GI_1_1_0)
    var sceneTagIdList : List<Int>
    @AddedIn(GI_1_2_0)
    var isSkipUi : Boolean
    @AddedIn(GI_1_3_0)
    var enterReason : Int
    @AddedIn(GI_1_6_0)
    var worldType : Int
    @AddedIn(GI_2_2_0)
    var sceneTransaction : String
    // TODO verify if these where added in 3.8 or 4.0
    @AddedIn(GI_4_0_0)
    var createPlayerUid : Int
    @AddedIn(GI_4_0_0)
    var LAJGLCIFKCP : Int //TODO identify this field
    @AddedIn(GI_4_0_0)
    var mapLayerInfo : org.anime_game_servers.multi_proto.gi.data.scene.MapLayerInfo
}
