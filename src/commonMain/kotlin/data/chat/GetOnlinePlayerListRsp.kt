package data.chat

import annotations.AddedIn
import data.general.avatar.ShowAvatarInfo
import data.scene.entity.OnlinePlayerInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetOnlinePlayerListRsp {
    var playerInfoList: List<OnlinePlayerInfo>
    @AddedIn(VERSION.V1_1_0)
    var param: Int
    var retCode: Int
}