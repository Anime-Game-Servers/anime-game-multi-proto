package data.quest.child

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_6_0)
@ProtoCommand(RESPONSE)
internal interface GetQuestLackingResourceRsp {
    var lackedNpcList: List<Int>
    var lackedNpcMap: Map<Int, Int>
    var lackedPlaceList: List<Int>
    var lackedPlaceMap: Map<Int, Int>
    var questId: Int
    var retCode: Int
}
