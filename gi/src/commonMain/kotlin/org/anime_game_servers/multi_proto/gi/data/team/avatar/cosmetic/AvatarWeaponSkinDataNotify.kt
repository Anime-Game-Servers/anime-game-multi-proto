package org.anime_game_servers.multi_proto.gi.data.team.avatar.cosmetic

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_5_7_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarWeaponSkinDataNotify {
    var skinInfoList: List<WeaponSkinInfo>
    var skinIdList: List<Int>
}