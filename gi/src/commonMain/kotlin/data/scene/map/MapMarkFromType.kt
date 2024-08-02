package data.scene.map

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class MapMarkFromType {
    @AltName("MAP_MARK_FROM_TYPE_NONE")
    MAP_MARK_FROM_TYPE_NOE,
    MAP_MARK_FROM_TYPE_MONSTER,
    MAP_MARK_FROM_TYPE_QUEST,
}
