package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
internal enum class CreateReason {
    @AltName("CREATE_REASON_NONE")
    CREATE_NONE,
    @AltName("CREATE_REASON_QUEST")
    CREATE_QUEST,
    @AltName("CREATE_REASON_ENERGY")
    CREATE_ENERGY,
}