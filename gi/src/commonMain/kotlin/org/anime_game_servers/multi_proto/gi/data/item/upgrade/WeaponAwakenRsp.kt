package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface WeaponAwakenRsp {
    var retCode: Retcode
    var avatarGuid: Long
    var curAffixLevelMap: Map<Int, Int>
    var oldAffixLevelMap: Map<Int, Int>
    var targetWeaponGuid: Long
    @AddedIn(GI_1_0_0)
    var targetWeaponAwakenLevel: Int
}
