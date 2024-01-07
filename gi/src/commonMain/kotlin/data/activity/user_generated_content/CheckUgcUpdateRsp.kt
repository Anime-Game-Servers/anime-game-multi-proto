package data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_7_0)
@ProtoCommand(CommandType.RESPONSE)
interface CheckUgcUpdateRsp {
    var ugcType: UgcType
    var updateUgcGuidList: List<Long>
    var returnCode: Int
}