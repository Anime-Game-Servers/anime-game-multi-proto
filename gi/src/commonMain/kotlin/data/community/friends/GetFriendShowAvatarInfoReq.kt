package data.community.friends

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_1_3_0)
@ProtoCommand(CommandType.REQUEST)
interface GetFriendShowAvatarInfoReq {
    var uid: Int
}