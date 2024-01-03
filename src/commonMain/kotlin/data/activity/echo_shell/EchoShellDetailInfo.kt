package data.activity.echo_shell

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_6_0
import messages.VERSION.V2_8_0

@AddedIn(V1_6_0)
@ProtoModel
interface EchoShellDetailInfo {
    var takenRewardList: List<Int>
    var shellList: List<Int>
    @AddedIn(V2_8_0)
    var passDungeonList: List<Int>
    @AddedIn(V2_8_0)
    var summerTimeDungeonList: List<SummerTimeDungeonInfo>
}