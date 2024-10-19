package org.anime_game_servers.multi_proto.gi.data.community.chat

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_2_4_0)
@ProtoEnum(parentClass = "ChatInfo")
enum class SystemHintType {
    @AltName("SYSTEM_HINT_TYPE_CHAT_NONE")
    CHAT_NONE,
    @AltName("SYSTEM_HINT_TYPE_CHAT_ENTER_WORLD")
    CHAT_ENTER_WORLD,
    @AltName("SYSTEM_HINT_TYPE_CHAT_LEAVE_WORLD")
    CHAT_LEAVE_WORLD
}