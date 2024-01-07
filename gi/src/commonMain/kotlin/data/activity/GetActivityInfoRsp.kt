package data.activity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetActivityInfoRsp {
    var retcode: Int
    var activityInfoList: List<ActivityInfo>
    @AddedIn(Version.GI_1_2_0)
    var activatedSaleIdList: List<Int>
    //@AddedIn(Version.GI_2_1_0)
    //var disableTransferPointInteractionList: Map<Int, Int>
}