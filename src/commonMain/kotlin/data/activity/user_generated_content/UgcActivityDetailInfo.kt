package data.activity.user_generated_content

import annotations.AddedIn
import data.activity.user_generated_content.dungeon.OfficialCustomDungeon
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_7_0)
@ProtoModel
interface UgcActivityDetailInfo {
    var isUgcFeaturesClosed: Boolean
    var customDungeonGroupId: Int
    var isEnableUgc: Boolean
    var officialCustomDungeonList: List<OfficialCustomDungeon>
}