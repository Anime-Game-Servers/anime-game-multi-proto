package data.item.forge

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface ForgeStartReq {
    var avatarId: Int
    var forgeCount: Int
    var forgeId: Int
}
