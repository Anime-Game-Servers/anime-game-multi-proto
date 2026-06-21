package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.CustomGadgetTreeInfo

@AddedIn(GI_2_6_0)
@ProtoCommand(REQUEST)
internal interface IrodoriEditFlowerCombinationReq {
    var combinationInfo: CustomGadgetTreeInfo
    var entityId: Int
}
