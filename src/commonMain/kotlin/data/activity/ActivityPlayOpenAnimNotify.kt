package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

// todo maybe send by the client?
@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
interface ActivityPlayOpenAnimNotify {
    var activityId: Int
}