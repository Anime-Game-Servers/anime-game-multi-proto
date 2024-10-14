package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_2_0)
@ProtoModel
interface CustomGadgetTreeInfo {
    var nodeList: List<CustomCommonNodeInfo>
}