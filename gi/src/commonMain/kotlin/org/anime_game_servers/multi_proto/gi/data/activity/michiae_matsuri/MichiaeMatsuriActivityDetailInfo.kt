package org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface MichiaeMatsuriActivityDetailInfo {
    var challengePosList: List<org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri.MichiaeMatsuriChallengePositionInfo>
    var chestPosList: List<org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri.MichiaeMatsuriChestPositionInfo>
    var gainCrystalExp: Int
    var stageList: List<org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri.MichiaeMatsuriStage>
    var unlockedCrystalSkillList: List<Int>
}
