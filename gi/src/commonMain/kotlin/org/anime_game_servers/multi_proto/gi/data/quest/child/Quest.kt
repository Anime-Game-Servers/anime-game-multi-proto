package org.anime_game_servers.multi_proto.gi.data.quest.child

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_4_0

@AddedIn(GI_CB1)
@ProtoModel
internal interface Quest {
    var questId: Int
    var state: Int
    var startTime: Int
    var isRandom: Boolean
    var parentQuestId: Int
    var questConfigId: Int
    var startGameTime: Int
    @AddedIn(GI_CB2)
    var acceptTime: Int
    @AddedIn(GI_CB2)
    var lackedNpcList:List<Int>
    @AddedIn(GI_CB2)
    var finishProgressList: List<Int>
    @AddedIn(GI_CB2)
    var failProgressList: List<Int>
    @AddedIn(GI_CB2)
    var lackedNpcMap: Map<Int, Int>
    @AddedIn(GI_1_4_0)
    var lackedPlaceList: List<Int>
    @AddedIn(GI_1_4_0)
    var lackedPlaceMap: Map<Int, Int>
}
