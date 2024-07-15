package data.item

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@RemovedIn(GI_1_6_0)
@ProtoCommand(NOTIFY)
internal interface ItemExceedLimitNotify {
    var isMaterialExceedLimit: Boolean
    var isReliquaryExceedLimit: Boolean
    var isWeaponExceedLimit: Boolean
    var itemIdList: List<Int>
}
