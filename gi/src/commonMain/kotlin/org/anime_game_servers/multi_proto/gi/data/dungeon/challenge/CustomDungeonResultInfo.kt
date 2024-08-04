package org.anime_game_servers.multi_proto.gi.data.dungeon.challenge

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface CustomDungeonResultInfo {
    var childChallengeList: List<ChallengeBrief>
    var dungeonGuid: Long
    var finishType: CustomDungeonFinishType
    var gotCoinNum: Int
    var isArriveFinish: Boolean
    var isLiked: Boolean
    var isStored: Boolean
    var timeCost: Int
}
