package org.anime_game_servers.multi_proto.gi.data.activity.michiae_matsuri

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface MichiaeMatsuriStage {
    var isOpen: Boolean
    var openTime: Int
    var stageId: Int
}
