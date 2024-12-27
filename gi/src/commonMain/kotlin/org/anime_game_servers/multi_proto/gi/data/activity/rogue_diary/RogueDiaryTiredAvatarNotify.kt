package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_7_0)
@ProtoCommand(CLIENT)
internal interface RogueDiaryTiredAvatarNotify {
    var isNeedShow: Boolean
    @AltName("optianalTiredAvatarList")
    var optionalTiredAvatarList: List<RogueDiaryAvatar>
    var reserveAvatarNum: Int
    var tiredType: Int
}
