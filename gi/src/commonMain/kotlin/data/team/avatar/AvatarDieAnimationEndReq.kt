package data.team.avatar

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface AvatarDieAnimationEndReq {
    var dieGuid: Long
    var rebornPos: Vector
    var skillId: Int
}
