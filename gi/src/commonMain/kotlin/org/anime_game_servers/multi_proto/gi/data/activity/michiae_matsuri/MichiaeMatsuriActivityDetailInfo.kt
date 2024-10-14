package org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface MichiaeMatsuriActivityDetailInfo {
    var challengePosList: List<MichiaeMatsuriChallengePositionInfo>
    var chestPosList: List<MichiaeMatsuriChestPositionInfo>
    var gainCrystalExp: Int
    var stageList: List<MichiaeMatsuriStage>
    var unlockedCrystalSkillList: List<Int>
}
