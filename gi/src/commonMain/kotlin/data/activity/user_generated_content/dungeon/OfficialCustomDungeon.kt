package data.activity.user_generated_content.dungeon

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface OfficialCustomDungeon {
    var dungeonId: Int
    var winTimes: Int
}