package data.scene

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(messages.VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerEnterSceneNotify {
    var sceneId : Int
    var pos : Vector
    var sceneBeginTime : Long
    var type : EnterType
    var targetUid : Int
    var prevSceneId : Int
    var prevPos : Vector
    var dungeonId : Int
    @AddedIn(VERSION.VCB2)
    var worldLevel : Int
    @AddedIn(VERSION.V0_9_0)
    var enterSceneToken : Int
    @AddedIn(VERSION.V1_0_0)
    var isFirstLoginEnterScene : Boolean
    @AddedIn(VERSION.V1_1_0)
    var sceneTagIdList : List<Int>
    @AddedIn(VERSION.V1_2_0)
    var isSkipUi : Boolean
    @AddedIn(VERSION.V1_3_0)
    var enterReason : Int
    @AddedIn(VERSION.V1_6_0)
    var worldType : Int
    @AddedIn(VERSION.V2_2_0)
    var sceneTransaction : String
}