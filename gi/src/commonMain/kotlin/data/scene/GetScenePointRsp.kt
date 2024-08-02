package data.scene

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface GetScenePointRsp {
    var belongUid: Int
    var lockedPointList: List<Int>
    var retcode: Int
    var sceneId: Int
    var unlockAreaList: List<Int>
    var unlockedPointList: List<Int>
    @AddedIn(GI_0_9_0)
    var groupUnlimitPointList: List<Int>
    @AddedIn(GI_0_9_0)
    var notExploredDungeonEntryList: List<Int>
    @AddedIn(GI_0_9_0)
    var toBeExploreDungeonEntryList: List<Int>
    @AddedIn(GI_1_0_0)
    var notInteractDungeonEntryList: List<Int>
    @AddedIn(GI_1_6_0)
    var hidePointList: List<Int>
    @AddedIn(GI_2_4_0)
    var unhidePointList: List<Int>
}
