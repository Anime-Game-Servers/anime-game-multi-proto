package data.activity.fleur_fair

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
interface FleurFairMusicGameSettleRsp {
    var isNewRecord: Boolean
    var isUnlockNextLevel: Boolean
    var musicBasicId: Int
    var retcode: Int
}