package data.battle.event

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class HitColliderType {
    @AltName("HIT_COLLIDER_TYPE_INVALID")
    HIT_COLLIDER_INVALID,
    @AltName("HIT_COLLIDER_TYPE_HIT_BOX")
    HIT_COLLIDER_HIT_BOX,
    @AltName("HIT_COLLIDER_TYPE_WET_HIT_BOX")
    HIT_COLLIDER_WET_HIT_BOX,
    @AltName("HIT_COLLIDER_TYPE_HEAD_BOX")
    HIT_COLLIDER_HEAD_BOX,
}
