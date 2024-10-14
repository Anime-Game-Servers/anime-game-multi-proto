package org.anime_game_servers.multi_proto.gi.data.activity.hide_and_seek

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HideAndSeekActivityDetailInfo {
    var chosenHiderSkillList: List<Int>
    var chosenHunterSkillList: List<Int>
    var unlockMapList: List<Int>
    @AddedIn(GI_2_4_0)
    var openMapInfoList: List<HideAndSeekMapInfo>
    @AddedIn(GI_3_3_0)
    var chosenMapList: List<Int>
}
