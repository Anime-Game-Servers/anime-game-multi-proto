package data.activity.user_generated_content

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_7_0)
@ProtoCommand(CommandType.NOTIFY)
interface UgcNotify {
    var isUgcPublishBan: Boolean
    var isUgcPublishFeatureClosed: Boolean
    var isUgcFeatureClosed: Boolean
}