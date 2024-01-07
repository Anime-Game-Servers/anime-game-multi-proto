package data.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.avatar.ShowAvatarInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_3_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetFriendShowAvatarInfoRsp {
    var uid: Int
    var showAvatarInfoList: List<ShowAvatarInfo>
    var retCode: Int
}