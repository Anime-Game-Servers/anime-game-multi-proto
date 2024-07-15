package data.item.forge

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class ForgeQueueManipulateType {
    FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT,
    FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE,
}
