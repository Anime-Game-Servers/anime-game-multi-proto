package data.item

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@RemovedIn(GI_CB2)
@ProtoEnum
internal enum class ItemAddReasonType {
    ITEM_ADD_REASON_NONE,
    ITEM_ADD_REASON_QUEST_ITEM,
    ITEM_ADD_REASON_QUEST_REWARD,
    ITEM_ADD_REASON_TRIFLE,
    ITEM_ADD_REASON_SHOP,
    ITEM_ADD_REASON_PLAYER_UPGRADE_REWARD,
}
