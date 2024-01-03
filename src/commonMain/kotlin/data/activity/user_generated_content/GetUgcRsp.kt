package data.activity.user_generated_content

import annotations.AddedIn
import data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import data.activity.user_generated_content.music_game.UgcMusicRecord
import messages.VERSION
import org.anime_game_servers.annotations.*

@AddedIn(VERSION.V2_7_0)
@ProtoCommand(CommandType.RESPONSE)
interface GetUgcRsp {
    var ugcGuid: Long
    var ugcType: UgcType
    var ugcRecordUsage: RecordUsage
    @OneOf(OneOfEntry(UgcMusicRecord::class, "music_record"))
    var record: OneOfType
    @OneOf(OneOfEntry(UgcMusicBriefInfo::class, "music_brief_info"))
    var brief: OneOfType
    var retcode: Int
}