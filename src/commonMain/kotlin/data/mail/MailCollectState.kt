package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V2_4_0)
@ProtoEnum
enum class MailCollectState {
    @AltName("MAIL_COLLECTIBLE_UNKONW", "MAIL_COLLECT_STATE_COLLECTIBLE_UNKONW", "MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN")
    MAIL_COLLECTIBLE_UNKNOWN,
    @AltName("MAIL_COLLECT_STATE_NOT_COLLECTIBLE")
    MAIL_NOT_COLLECTIBLE,
    @AltName("MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED")
    MAIL_COLLECTIBLE_UNCOLLECTED,
    @AltName("MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED")
    MAIL_COLLECTIBLE_COLLECTED,

}