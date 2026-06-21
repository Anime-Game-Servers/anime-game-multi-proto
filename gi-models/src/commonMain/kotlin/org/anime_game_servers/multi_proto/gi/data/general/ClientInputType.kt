package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_4_0)
@ProtoEnum
internal enum class ClientInputType {
    @AltName("CLIENT_INPUT_TYPE_NONE")
    CLIENT_INPUT_NONE,
    @AltName("CLIENT_INPUT_KEYBORD_MOUSE","CLIENT_INPUT_TYPE_KEYBOARD_MOUSE")
    CLIENT_INPUT_KEYBOARD_MOUSE,
    @AltName("CLIENT_INPUT_TYPE_GAMEPAD")
    CLIENT_INPUT_GAMEPAD,
    @AltName("CLIENT_INPUT_TYPE_TOUCH_PANEL")
    CLIENT_INPUT_TOUCH_PANEL,
}
