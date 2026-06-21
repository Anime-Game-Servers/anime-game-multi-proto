package org.anime_game_servers.multi_proto.gi.data.quest.giving

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
// TODO this was removed between 4.1.0 and 4.5.0
@AddedIn(GI_2_8_0) @RemovedIn(GI_4_5_0)
@ProtoEnum("ItemGivingReq")
internal enum class ItemGivingType {
    @AltName("ITEM_GIVING_TYPE_QUEST")
    QUEST,
    @AltName("ITEM_GIVING_TYPE_GADGET")
    GADGET,
}
