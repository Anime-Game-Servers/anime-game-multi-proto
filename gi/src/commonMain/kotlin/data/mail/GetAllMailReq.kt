package data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.Version

@AddedIn(Version.GI_CB1)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST)
interface GetAllMailReq {
    @AddedIn(Version.GI_2_4_0)
    var isCollected : Boolean
}