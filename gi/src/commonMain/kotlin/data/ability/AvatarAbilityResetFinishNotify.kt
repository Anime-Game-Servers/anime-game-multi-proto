package data.ability

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@RemovedIn(GI_1_0_0)
@ProtoCommand(CLIENT)
internal interface AvatarAbilityResetFinishNotify {
    var entityId: Int
    var resetReason: AbilityResetReason
    @AddedIn(GI_0_9_0)
    var invokes: List<AbilityInvokeEntry>
}
