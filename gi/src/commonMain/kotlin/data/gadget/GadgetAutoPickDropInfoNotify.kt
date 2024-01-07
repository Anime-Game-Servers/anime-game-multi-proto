package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_2_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetAutoPickDropInfoNotify {
    var itemList: List<Item>
}