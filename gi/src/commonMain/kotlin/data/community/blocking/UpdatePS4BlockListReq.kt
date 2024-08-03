package data.community.blocking

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(REQUEST)
internal interface UpdatePS4BlockListReq {
    @RemovedIn(GI_1_5_0)
    var onlineIdList: List<String>
    @AddedIn(GI_1_5_0)
    var psnIdList: List<String>
}
