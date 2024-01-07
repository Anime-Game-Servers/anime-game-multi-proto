package data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
enum class AuthkeySignType {
    AUTHKEY_SIGN_TYPE_NONE,
    AUTHKEY_SIGN_TYPE_DEFAULT,
    AUTHKEY_SIGN_TYPE_RSA,
}