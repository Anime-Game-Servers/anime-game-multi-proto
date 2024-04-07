package data.battle

import data.general.ability.ServerBuff
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface ServerBuffChangeNotify {
    var avatarGuidList: List<Long>
    var serverBuffChangeType: ServerBuffChangeType
    var serverBuffList: List<ServerBuff>
    @AddedIn(GI_2_2_0)
    var entityIdList: List<Int>
    @AddedIn(GI_2_2_0)
    var isCreatureBuff: Boolean
}
