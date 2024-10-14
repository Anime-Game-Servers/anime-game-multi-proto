package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
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
    @AddedIn(Version.GI_2_1_0)
    @AltName("AVATAR_EXPEDITION_STATE_LOCKED")
    AVATAR_EXPEDITION_LOCKED,
}
