package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface GetGachaInfoRsp {
    var retcode: Retcode
    var gachaInfoList: List<GachaInfo>
    var gachaRandom: Int
    @AddedIn(GI_2_3_0)
    var dailyGachaTimes: Int
    @AddedIn(GI_2_3_0)
    var isUnderMinorsRestrict: Boolean
    @AddedIn(GI_3_1_0)
    var isUnderGeneralRestrict: Boolean
}
