package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_7_0)
@ProtoCommand(RESPONSE)
internal interface PublishUgcRsp {
    var retcode: Retcode
    var ugcGuid: Long
    var ugcType: UgcType
}
