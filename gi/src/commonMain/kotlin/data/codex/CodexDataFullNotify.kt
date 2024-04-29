package data.codex

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(NOTIFY)
internal interface CodexDataFullNotify {
    @RemovedIn(GI_1_1_0)
    var exp: Int
    @RemovedIn(GI_1_1_0)
    var level: Int
    var typeDataList: List<CodexTypeData>
    @AddedIn(GI_2_6_0)
    var lastReadPushtipsCodexId: Int
    @AddedIn(GI_2_6_0)
    var lastReadPushtipsTypeId: Int
    @AddedIn(GI_2_6_0)
    var recentViewedPushtipsList: List<Int>
}
