package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
internal interface NightCrowGadgetInfo {
    var argumentList: List<Int>
}
