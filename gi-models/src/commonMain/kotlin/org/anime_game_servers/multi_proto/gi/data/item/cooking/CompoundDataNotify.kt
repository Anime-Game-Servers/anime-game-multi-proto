package org.anime_game_servers.multi_proto.gi.data.item.cooking

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface CompoundDataNotify {
    @AltName("compoundQueDataList")
    var compoundQueueDataList: List<CompoundQueueData>
    var unlockCompoundList: List<Int>
}
