package org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface ChannelerSlabActivityDetailInfo {
    var buffInfo: ChannelerSlabBuffInfo
    var loopDungeonStageInfo: ChannelerSlabLoopDungeonStageInfo
    var playEndTime: Int
    var stageList: List<ChannelerSlabChallengeStage>
}
