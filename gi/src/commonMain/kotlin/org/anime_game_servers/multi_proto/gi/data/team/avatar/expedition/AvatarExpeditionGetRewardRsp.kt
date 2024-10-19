package org.anime_game_servers.multi_proto.gi.data.team.avatar.expedition

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface AvatarExpeditionGetRewardRsp {
    var retcode: Retcode
    var expeditionInfoMap: Map<Long, AvatarExpeditionInfo>
    @AddedIn(GI_2_5_0)
    var extraItemList: List<ItemParam>
    @AddedIn(GI_2_5_0)
    var itemList: List<ItemParam>
}
