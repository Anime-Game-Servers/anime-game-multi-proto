package data.item.management

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(RESPONSE)
internal interface ReliquaryDecomposeRsp {
    var retCode: Int
    @AddedIn(GI_2_0_0)
    var guidList: List<Long>
}
