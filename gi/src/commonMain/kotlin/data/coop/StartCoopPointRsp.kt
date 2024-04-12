package data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
internal interface StartCoopPointRsp {
    var coopPoint: Int
    var isStart: Boolean
    var retcode: Int
    var startMainCoop: MainCoop
}
