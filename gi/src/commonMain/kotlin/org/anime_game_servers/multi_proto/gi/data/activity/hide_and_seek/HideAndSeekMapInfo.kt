package org.anime_game_servers.multi_proto.gi.data.activity.hide_and_seek

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface HideAndSeekMapInfo {
    var id: Int
    var matchLockReasonList: List<Int>
}
