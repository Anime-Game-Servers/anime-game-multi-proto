package data.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.avatar.ShowAvatarInfo
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetOnlinePlayerListRsp {
    var playerInfoList: List<OnlinePlayerInfo>
    @AddedIn(Version.GI_1_1_0)
    var param: Int
    var retCode: Int
}