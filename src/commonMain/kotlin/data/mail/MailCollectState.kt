package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V2_4_0)
@ProtoEnum
enum class MailCollectState {
    MAIL_COLLECTIBLE_UNKONW,
    MAIL_NOT_COLLECTIBLE,
    MAIL_COLLECTIBLE_UNCOLLECTED,
    MAIL_COLLECTIBLE_COLLECTED,

}