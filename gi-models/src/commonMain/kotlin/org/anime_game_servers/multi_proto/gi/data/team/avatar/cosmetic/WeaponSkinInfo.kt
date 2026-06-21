package org.anime_game_servers.multi_proto.gi.data.team.avatar.cosmetic

import org.anime_game_servers.core.base.Version.GI_5_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_5_7_0)
@ProtoModel
internal interface WeaponSkinInfo {
    var weaponSkinId: Int
    var expireTime: Long
}
