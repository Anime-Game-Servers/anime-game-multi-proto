package org.anime_game_servers.multi_proto.gi.data.quest.child

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_6_0)
@ProtoCommand(RESPONSE)
internal interface GetQuestLackingResourceRsp {
    var retCode: Retcode
    var lackedNpcList: List<Int>
    var lackedNpcMap: Map<Int, Int>
    var lackedPlaceList: List<Int>
    var lackedPlaceMap: Map<Int, Int>
    var questId: Int
}
