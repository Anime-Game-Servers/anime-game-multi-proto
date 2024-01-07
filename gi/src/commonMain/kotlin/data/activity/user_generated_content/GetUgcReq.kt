package data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import data.activity.user_generated_content.music_game.UgcMusicRecord
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_7_0)
@ProtoCommand(CommandType.REQUEST)
interface GetUgcReq {
    var ugcType: UgcType
    var ugcGuid: Long
    var getUgcType: GetUgcType
    var isRequireBrief: Boolean
    var ugcRecordUsage: RecordUsage
}