package data.chat

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
interface ChatHistoryNotify {
    var chatInfo: List<ChatInfo>
    var channelId: Int
}