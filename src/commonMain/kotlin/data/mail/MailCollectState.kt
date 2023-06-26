package data.mail

import org.anime_game_servers.annotations.ProtoEnum

@ProtoEnum
enum class MailCollectState {
    MAIL_COLLECTIBLE_UNKONW,
    MAIL_NOT_COLLECTIBLE,
    MAIL_COLLECTIBLE_UNCOLLECTED,
    MAIL_COLLECTIBLE_COLLECTED,

}