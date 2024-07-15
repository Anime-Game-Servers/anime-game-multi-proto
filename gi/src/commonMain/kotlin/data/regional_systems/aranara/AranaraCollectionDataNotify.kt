package data.regional_systems.aranara

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_0_0)
@ProtoCommand(NOTIFY)
internal interface AranaraCollectionDataNotify {
    var collectionSuiteList: List<AranaraCollectionSuite>
}
