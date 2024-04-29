package data.codex

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface CodexTypeData {
    var codexIdList: List<Int>
    var type: CodexType
    @AddedIn(GI_1_1_0)
    var haveViewedList: List<Boolean>
    @AddedIn(GI_1_1_0)
    var weaponMaxPromoteLevelMap: Map<Int, Int>
}
