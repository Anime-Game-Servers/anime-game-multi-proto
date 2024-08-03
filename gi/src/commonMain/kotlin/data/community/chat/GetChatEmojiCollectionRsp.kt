package data.community.chat

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_1_0)
@ProtoCommand(RESPONSE)
internal interface GetChatEmojiCollectionRsp {
    var chatEmojiCollectionData: ChatEmojiCollectionData
    var retcode: Int
}
