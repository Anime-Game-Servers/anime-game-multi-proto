package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.verify

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement.HomeSceneArrangementMuipData

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeVerifyData {
    var homeInfo: HomeVerifySceneData
    var lang: LanguageType
    var region: String
    var timestamp: Int
    var uid: Int
    @AddedIn(GI_2_7_0)
    var aid: String
    @AddedIn(GI_2_7_0)
    var arrangementData: HomeSceneArrangementMuipData
    @AddedIn(GI_2_7_0)
    var token: String
}
