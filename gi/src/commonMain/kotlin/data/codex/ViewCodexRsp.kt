package data.codex

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface ViewCodexRsp {
    var retcode: Int
    var typeDataList: List<CodexTypeData>
    @AddedIn(GI_2_6_0)
    var recentViewedPushtipsList: List<Int>
    @AddedIn(GI_2_8_0)
    var pushTipsReadList: List<Int>
    @AddedIn(GI_2_8_0)
    var pushTipsRewardList: List<Int>
}
