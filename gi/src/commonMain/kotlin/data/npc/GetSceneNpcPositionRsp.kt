package data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE, alternateNames = ["GetSceneNpcPostionRsp"])
interface GetSceneNpcPositionRsp {
    var sceneId: Int
    var npcInfoList: List<NpcPositionInfo>
    var retCode: Int
}