package data.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_2_0)
@ProtoCommand(CommandType.RESPONSE)
interface PullPrivateChatRsp {
    var chatInfo: List<ChatInfo>
    var retCode: Int
}