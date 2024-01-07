package data.activity.user_generated_content.music_game

import org.anime_game_servers.core.base.annotations.AddedIn
import data.activity.user_generated_content.UgcType
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_7_0)
@ProtoCommand(CommandType.REQUEST)
interface CheckUgcUpdateReq {
    var ugcType: UgcType
}