package data.team.avatar.expedition

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface AvatarExpeditionAllDataRsp {
    var expeditionCountLimit: Int
    var expeditionInfoMap: Map<Long, data.team.avatar.expedition.AvatarExpeditionInfo>
    var openExpeditionList: List<Int>
    var retcode: Int
}
