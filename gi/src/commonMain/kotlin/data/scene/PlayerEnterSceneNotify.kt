package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
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
    @AddedIn(Version.GI_CB2)
    var worldLevel : Int
    @AddedIn(Version.GI_0_9_0)
    var enterSceneToken : Int
    @AddedIn(Version.GI_1_0_0)
    var isFirstLoginEnterScene : Boolean
    @AddedIn(Version.GI_1_1_0)
    var sceneTagIdList : List<Int>
    @AddedIn(Version.GI_1_2_0)
    var isSkipUi : Boolean
    @AddedIn(Version.GI_1_3_0)
    var enterReason : Int
    @AddedIn(Version.GI_1_6_0)
    var worldType : Int
    @AddedIn(Version.GI_2_2_0)
    var sceneTransaction : String
}