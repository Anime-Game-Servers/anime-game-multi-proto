package org.anime_game_servers.multi_proto.gi.data.item.cooking

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface PlayerCookRsp {
    var retcode: Retcode
    @RemovedIn(GI_0_9_0)
    var item: ItemParam
    var qteQuality: Int
    var recipeData: CookRecipeData
    @AddedIn(GI_0_9_0)
    var cookCount: Int
    @AddedIn(GI_0_9_0)
    var itemList: List<ItemParam>
    @AddedIn(GI_1_2_0)
    @AltName("extralItemList")
    var extraItemList: List<ItemParam>
}
