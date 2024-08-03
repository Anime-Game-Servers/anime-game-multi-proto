package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicBriefInfo
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.music_game.UgcMusicRecord
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.*

@AddedIn(Version.GI_2_7_0)
@ProtoCommand(CommandType.REQUEST)
interface SaveUgcReq {
    var ugcType: UgcType
    @OneOf(OneOfEntry(UgcMusicRecord::class, "music_record"))
    var record: OneOfType
    @OneOf(OneOfEntry(UgcMusicBriefInfo::class, "music_brief_info"))
    var brief: OneOfType
}