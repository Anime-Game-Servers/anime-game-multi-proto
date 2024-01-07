package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_2_8_0

@AddedIn(GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
interface SceneDataNotify {
    var levelConfigNameList : List<String>
    @AddedIn(GI_2_8_0)
    var sceneTagIdList : List<Int>
}