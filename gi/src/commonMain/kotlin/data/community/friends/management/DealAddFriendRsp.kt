package data.community.friends.management

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface DealAddFriendRsp {
    var dealAddFriendResult: DealAddFriendResultType
    var retcode: Int
    var targetUid: Int
}
