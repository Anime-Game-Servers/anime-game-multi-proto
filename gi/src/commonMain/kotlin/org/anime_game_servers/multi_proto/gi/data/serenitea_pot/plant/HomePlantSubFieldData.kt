package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.plant

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface HomePlantSubFieldData {
    var endTime: Int
    var entityIdList: List<Int>
    var fieldStatus: HomePlantFieldStatus
    var seedId: Int
    @AddedIn(GI_2_2_0)
    var homeGatherId: Int
}
