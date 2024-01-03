package data.npc

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE, alternateNames = ["GetSceneNpcPostionRsp"])
interface GetSceneNpcPositionRsp {
    var sceneId: Int
    var npcInfoList: List<NpcPositionInfo>
    var retCode: Int
}