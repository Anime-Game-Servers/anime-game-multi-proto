package data.chat

import annotations.AddedIn
import data.general.avatar.ShowAvatarInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetFriendShowAvatarInfoRsp {
    var uid: Int
    var showAvatarInfoList: List<ShowAvatarInfo>
    var retCode: Int
}