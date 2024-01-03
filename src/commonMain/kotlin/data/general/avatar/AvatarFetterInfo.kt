package data.general.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface AvatarFetterInfo {
    var expNumber: Int
    var expLevel: Int
    var openIdList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var finishIdList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var rewardedFetterLevelList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var fetterList: List<FetterData>
}