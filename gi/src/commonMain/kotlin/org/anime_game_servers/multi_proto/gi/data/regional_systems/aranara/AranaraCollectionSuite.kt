package org.anime_game_servers.multi_proto.gi.data.regional_systems.aranara

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface AranaraCollectionSuite {
    var collectionIdStateMap: Map<Int, AranaraCollectionState>
    var collectionType: Int
}
