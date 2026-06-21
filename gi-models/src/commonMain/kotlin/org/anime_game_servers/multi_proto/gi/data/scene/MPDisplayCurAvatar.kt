package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0

@AddedIn(GI_CB2) @RemovedIn(GI_1_0_0)
@ProtoModel
internal interface MPDisplayCurAvatar {
    var playerUid: Int
    var avatarGuid: Long
    var lifeState: Int
    var fightPropMap: Map<Int, Float>
}
