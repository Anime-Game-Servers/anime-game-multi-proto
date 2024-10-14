package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_0_0)
@ProtoEnum("CheckAddItemExceedLimitNotify")
internal enum class ItemExceedLimitMsgType {
    @AltName("ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT")
    ITEM_EXCEED_LIMIT_MSG_DEFAULT,
    @AltName("ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT")
    ITEM_EXCEED_LIMIT_MSG_TEXT,
    @AltName("ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG")
    ITEM_EXCEED_LIMIT_MSG_DIALOG,
    @AddedIn(GI_2_3_0)
    @AltName("ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG_NONBLOCK")
    ITEM_EXCEED_LIMIT_MSG_DIALOG_NONBLOCK,
}
