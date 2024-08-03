package data.community.friends

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(CLIENT)
internal interface UpdatePS4FriendListNotify {
    @RemovedIn(GI_1_5_0)
    var onlineIdList: List<String>
    @AddedIn(GI_1_5_0)
    var psnIdList: List<String>
}
