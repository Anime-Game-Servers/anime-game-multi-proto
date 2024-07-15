package data.item.upgrade

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface WeaponAwakenRsp {
    var avatarGuid: Long
    var curAffixLevelMap: Map<Int, Int>
    var oldAffixLevelMap: Map<Int, Int>
    var targetWeaponGuid: Long
    var retCode: Int
    @AddedIn(GI_1_0_0)
    var targetWeaponAwakenLevel: Int
}
