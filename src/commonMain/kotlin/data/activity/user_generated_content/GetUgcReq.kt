package data.activity.user_generated_content

import annotations.AddedIn
import data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import data.activity.user_generated_content.music_game.UgcMusicRecord
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_7_0)
@ProtoCommand(CommandType.REQUEST)
interface GetUgcReq {
    var ugcType: UgcType
    var ugcGuid: Long
    var getUgcType: GetUgcType
    var isRequireBrief: Boolean
    var ugcRecordUsage: RecordUsage
}