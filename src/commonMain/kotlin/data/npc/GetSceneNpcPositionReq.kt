package data.npc

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST, alternateNames = ["GetSceneNpcPostionReq"])
internal interface GetSceneNpcPositionReq {
    var sceneId: Int
    var npcIdList: List<Int>
}
