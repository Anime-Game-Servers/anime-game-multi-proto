package data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel("MaterialDeleteInfo")
interface CountDownDelete {
    var deleteTimeNumMap: Map<Int,Int>
    var configCountDownTime: Int
}