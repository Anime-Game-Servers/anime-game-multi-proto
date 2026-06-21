package org.anime_game_servers.multi_proto.gi.data.item.forge

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.core.annotations.Converters
import org.anime_game_servers.multi_proto.gi.converters.ItemParamToItemHintConverter
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.item.ItemHint

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ForgeQueueManipulateRsp {
    var retCode: Retcode
    //changed type from originally ItemParam to ItemHint
    @Converters(ItemParamToItemHintConverter::class)
    var extraOutputItemList: List<ItemHint>
    var manipulateType: ForgeQueueManipulateType
    //changed type from originally ItemParam to ItemHint
    @Converters(ItemParamToItemHintConverter::class)
    var outputItemList: List<ItemHint>
    //changed type from originally ItemParam to ItemHint
    @Converters(ItemParamToItemHintConverter::class)
    var returnItemList: List<ItemHint>
}
