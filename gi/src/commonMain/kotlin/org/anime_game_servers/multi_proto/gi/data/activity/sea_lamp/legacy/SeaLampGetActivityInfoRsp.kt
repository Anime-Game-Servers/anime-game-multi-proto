package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.legacy

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.SeaLampActivityPlayerInfo
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode


@AddedIn(GI_CB2)
@RemovedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface SeaLampGetActivityInfoRsp {
    var retcode: Retcode
    var activityInfo: SeaLampActivityInfo
    var activityPlayerInfo: SeaLampActivityPlayerInfo
}