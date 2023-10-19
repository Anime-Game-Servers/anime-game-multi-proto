package data.gadget

import annotations.AddedIn
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetAutoPickDropInfoNotify {
    var itemList: List<Item>
}