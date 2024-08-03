package org.anime_game_servers.multi_proto.gi.data.quest.parent

import org.anime_game_servers.multi_proto.gi.data.quest.inference.InferencePageInfo
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface ParentQuest {
    var childQuestList: List<org.anime_game_servers.multi_proto.gi.data.quest.parent.ChildQuest>
    var isFinished: Boolean
    var isRandom: Boolean
    var parentQuestId: Int
    var randomInfo: org.anime_game_servers.multi_proto.gi.data.quest.parent.ParentQuestRandomInfo
    @AddedIn(GI_CB2)
    var questVar: List<Int>
    @AddedIn(GI_0_9_0)
    var parentQuestState: Int
    @AddedIn(GI_1_2_0)
    var questVarSeq: Int
    @AddedIn(GI_1_6_0)
    var timeVarMap: Map<Int, Int>
    @AddedIn(GI_2_7_0)
    var videoKey: Long
    @AddedIn(GI_3_0_0)
    var inferencePageList: List<org.anime_game_servers.multi_proto.gi.data.quest.inference.InferencePageInfo>
}
