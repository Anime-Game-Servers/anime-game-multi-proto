package data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_2_0)
@ProtoModel
interface CustomCommonNodeInfo {
    var parentIndex: Int
    val configId: Int
    val slotIdentifier: String
}