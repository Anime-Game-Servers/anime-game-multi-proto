package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface AvatarFetterInfo {
    var expNumber: Int
    var expLevel: Int
    var openIdList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var finishIdList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var rewardedFetterLevelList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var fetterList: List<org.anime_game_servers.multi_proto.gi.data.general.avatar.FetterData>
}