package org.anime_game_servers.multi_proto.gi.data.blossom

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface BlossomBriefInfo {
    var circleCampId: Int
    var cityId: Int
    var isGuideOpened: Boolean
    var monsterLevel: Int
    var pos: Vector
    var refreshId: Int
    var resin: Int
    var rewardId: Int
    var state: Int
    @AddedIn(GI_1_6_0)
    var sceneId: Int
}
