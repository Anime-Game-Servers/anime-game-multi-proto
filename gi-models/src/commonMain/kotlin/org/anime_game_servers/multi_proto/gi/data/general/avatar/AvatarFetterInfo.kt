package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface AvatarFetterInfo {
    var expNumber: Int
    var expLevel: Int
    var openIdList: List<Int>
    @AddedIn(GI_1_0_0)
    var finishIdList: List<Int>
    @AddedIn(GI_1_0_0)
    var rewardedFetterLevelList: List<Int>
    @AddedIn(GI_1_0_0)
    var fetterList: List<FetterData>
}