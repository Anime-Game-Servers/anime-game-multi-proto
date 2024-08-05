package org.anime_game_servers.multi_proto.gi.data.scene.group_link

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface GroupLinkBundle {
    var bundleId: Int
    var center: Vector
    var isActivated: Boolean
    var radius: Int
    var sceneId: Int
    @AddedIn(GI_2_4_0)
    var isShowMark: Boolean
}
