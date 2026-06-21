package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface RechargeRsp {
    var retcode: Retcode
    var productId: String
    @AddedIn(GI_2_3_0)
    var isShowMinorsHint: Boolean
}
