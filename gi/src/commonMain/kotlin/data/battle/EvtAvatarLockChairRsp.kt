package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(RESPONSE)
internal interface EvtAvatarLockChairRsp {
    var chairId: Long
    var entityId: Int
    var position: Vector
    var retcode: Int
}
