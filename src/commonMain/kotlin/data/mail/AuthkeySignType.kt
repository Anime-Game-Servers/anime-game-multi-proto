package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.VCB1)
@ProtoEnum
enum class AuthkeySignType {
    AUTHKEY_SIGN_TYPE_NONE,
    AUTHKEY_SIGN_TYPE_DEFAULT,
    AUTHKEY_SIGN_TYPE_RSA,
}