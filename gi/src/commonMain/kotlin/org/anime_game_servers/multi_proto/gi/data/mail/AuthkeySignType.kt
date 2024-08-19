package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class AuthkeySignType {
    AUTHKEY_SIGN_TYPE_NONE,
    AUTHKEY_SIGN_TYPE_DEFAULT,
    AUTHKEY_SIGN_TYPE_RSA,
}
