package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_2_4_0)
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