package org.anime_game_servers.multi_proto.gi.data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_8_0

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface EchoShellDetailInfo {
    var shellList: List<Int>
    var takenRewardList: List<Int>
    @AddedIn(GI_2_8_0)
    var passDungeonList: List<Int>
    @AddedIn(GI_2_8_0)
    var summerTimeDungeonList: List<SummerTimeDungeonInfo>
}
