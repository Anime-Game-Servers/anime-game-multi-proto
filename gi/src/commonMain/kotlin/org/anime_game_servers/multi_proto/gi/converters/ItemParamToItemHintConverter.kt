package org.anime_game_servers.multi_proto.gi.converters

import org.anime_game_servers.multi_proto.core.annotations.Converter
import org.anime_game_servers.multi_proto.core.annotations.TypeConverter
import org.anime_game_servers.multi_proto.gi.messages.general.item.ItemParam // as ItemParamImpl
import org.anime_game_servers.multi_proto.gi.messages.item.ItemHint // as ItemHintImpl
//import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
//import org.anime_game_servers.multi_proto.gi.data.item.ItemHint

typealias ItemParamImpl = ItemParam
typealias ItemHintImpl = ItemHint

@Converter(ItemParam::class, ItemHint::class)
object ItemParamToItemHintConverter : TypeConverter<ItemParamImpl, ItemHintImpl> {
    override fun inToOut(inData: ItemParamImpl): ItemHintImpl = ItemHintImpl(count = inData.count, itemId = inData.itemId)
    override fun outToIn(outData: ItemHintImpl): ItemParamImpl = ItemParamImpl(count = outData.count, itemId = outData.itemId)
}