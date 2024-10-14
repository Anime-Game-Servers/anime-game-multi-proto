package org.anime_game_servers.multi_proto.gi.data.quest.bargain

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface GetAllActivatedBargainDataRsp {
    var retCode: Retcode
    var snapshotList: List<BargainSnapshot>
}
