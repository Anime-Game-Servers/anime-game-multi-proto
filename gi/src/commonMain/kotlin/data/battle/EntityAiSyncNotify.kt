package data.battle

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(CLIENT)
internal interface EntityAiSyncNotify {
    var infoList: List<AiSyncInfo>
    var localAvatarAlertedMonsterList: List<Int>
}
