package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CLIENT)
internal interface EvtAvatarSitDownNotify {
    var entityId: Int
    var position: Vector
    @AddedIn(GI_1_4_0)
    var chairId: Long
}
