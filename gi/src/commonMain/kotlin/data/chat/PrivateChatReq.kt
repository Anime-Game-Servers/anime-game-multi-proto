package data.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.*


@AddedIn(Version.GI_1_2_0)
@ProtoCommand(CommandType.REQUEST)
interface PrivateChatReq {
    var targetUid: Int
    @OneOf(
        OneOfEntry(String::class, "text"),
        OneOfEntry(Int::class, "icon")
    )
    var content: OneOfType
}