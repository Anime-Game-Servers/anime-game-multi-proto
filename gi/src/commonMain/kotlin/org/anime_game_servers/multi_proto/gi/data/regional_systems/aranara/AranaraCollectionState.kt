package org.anime_game_servers.multi_proto.gi.data.regional_systems.aranara

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_0_0)
@ProtoEnum
internal enum class AranaraCollectionState {
    ARANARA_COLLECTION_STATE_NONE,
    ARANARA_COLLECTION_STATE_COLLECTABLE,
    ARANARA_COLLECTION_STATE_COLLECTED,
    ARANARA_COLLECTION_STATE_FINISHED,
}
