package data.team.avatar.expedition

import data.general.avatar.AvatarExpeditionState
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface AvatarExpeditionInfo {
    var expId: Int
    var hourTime: Int
    var startTime: Int
    var state: AvatarExpeditionState
    @AddedIn(GI_1_0_0)
    var shortenRatio: Float
}
