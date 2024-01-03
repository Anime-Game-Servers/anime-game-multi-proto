package data.general.avatar

import annotations.AddedIn
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoEnum
internal enum class AvatarExpeditionState {
    @AltName("AVATAR_EXPEDITION_STATE_NONE")
    AVATAR_EXPEDITION_NONE,
    @AltName("AVATAR_EXPEDITION_STATE_DOING")
    AVATAR_EXPEDITION_DOING,
    @AltName("AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD")
    AVATAR_EXPEDITION_FINISH_WAIT_REWARD,
    @AltName("AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD")
    AVATAR_EXPEDITION_CALLBACK_WAIT_REWARD,
    @AddedIn(VERSION.V2_1_0)
    @AltName("AVATAR_EXPEDITION_STATE_LOCKED")
    AVATAR_EXPEDITION_LOCKED,
}
