package data.achievement

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.V1_0_0)
@ProtoCommand(CommandType.NOTIFY)
interface AchievementUpdateNotify {
    var achievementList: List<Achievement>
}