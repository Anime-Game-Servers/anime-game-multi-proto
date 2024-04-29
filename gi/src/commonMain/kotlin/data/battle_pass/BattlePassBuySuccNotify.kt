package data.battle_pass

import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface BattlePassBuySuccNotify {
    var addPoint: Int
    var itemList: List<ItemParam>
    var productPlayType: Int
    var scheduleId: Int
}
