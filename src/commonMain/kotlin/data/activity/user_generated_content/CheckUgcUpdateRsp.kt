package data.activity.user_generated_content

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_7_0)
@ProtoCommand(CommandType.RESPONSE)
interface CheckUgcUpdateRsp {
    var ugcType: UgcType
    var updateUgcGuidList: List<Long>
    var returnCode: Int
}