package org.anime_game_servers.multi_proto.gi.data.general.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel("CreateGadgetInfo")
internal interface Chest {
    var chestDropId: Int
    var isShowCutscene: Boolean
}
