package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetActivityInfoRsp {
    var retcode: Int
    var activityInfoList: List<ActivityInfo>
    @AddedIn(VERSION.V1_2_0)
    var activatedSaleIdList: List<Int>
    //@AddedIn(VERSION.V2_1_0)
    //var disableTransferPointInteractionList: Map<Int, Int>
}