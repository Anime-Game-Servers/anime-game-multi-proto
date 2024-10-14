package org.anime_game_servers.multi_proto.gi.data.item.cooking

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_3_0_0)
@ProtoCommand(RESPONSE)
internal interface PlayerCompoundMaterialBoostRsp {
    var retcode: Retcode
    @AltName("compoundQueueDataList")
    var compoundQueDataList: List<CompoundQueueData>
    var takeStatus: CompoundBoostTakeStatusType
    @AddedIn(GI_3_1_0)
    var takeItemList: List<ItemParam>
}
