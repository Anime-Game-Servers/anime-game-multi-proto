package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.REQUEST)
interface ActivitySelectAvatarCardReq {
    var activityId: Int
    var rewardId: Int
}