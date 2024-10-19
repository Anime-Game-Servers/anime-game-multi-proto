package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_4_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.item.Item

@AddedIn(GI_4_0_0)
@ProtoModel
internal interface TrifleGadget {
    var item: Item
    var unk40_GAHBDCCFPGJ: Int
}
