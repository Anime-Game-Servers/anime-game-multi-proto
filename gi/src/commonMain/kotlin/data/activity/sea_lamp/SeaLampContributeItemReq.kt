package data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampContributeItemReq {
    var itemList: List<ItemParam>
    @AddedIn(Version.GI_1_0_0)
    var activityId: Int
}