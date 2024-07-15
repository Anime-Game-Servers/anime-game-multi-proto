package data.item.upgrade

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface WeaponPromoteReq {
    @RemovedIn(GI_CB2)
    var foodWeaponGuidList: List<Long>
    var targetWeaponGuid: Long
}
