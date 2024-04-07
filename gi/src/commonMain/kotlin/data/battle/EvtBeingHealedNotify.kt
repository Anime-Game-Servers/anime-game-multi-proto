package data.battle

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_3_0)
@ProtoCommand(CLIENT)
internal interface EvtBeingHealedNotify {
    var healAmount: Float
    var realHealAmount: Float
    var sourceId: Int
    var targetId: Int
}
