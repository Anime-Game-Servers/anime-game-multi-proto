package org.anime_game_servers.multi_proto.gi.data.team.avatar.cosmetic

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_5_7_0)
@ProtoModel
internal interface WeaponSkinInfo {
    var expireTime: Long
    var weaponSkinId: Int
}
