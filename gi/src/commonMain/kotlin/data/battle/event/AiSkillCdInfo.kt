package data.battle.event

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AiSkillCdInfo {
    var skillCdMap: Map<Int, Int>
    @AddedIn(GI_1_2_0)
    var skillGroupCdMap: Map<Int, Int>
}
