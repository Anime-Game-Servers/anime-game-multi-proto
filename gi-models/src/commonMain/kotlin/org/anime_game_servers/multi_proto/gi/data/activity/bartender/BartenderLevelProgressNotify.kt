package org.anime_game_servers.multi_proto.gi.data.activity.bartender

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_5_0)
@ProtoCommand(CLIENT)
internal interface BartenderLevelProgressNotify {
    var isFinish: Boolean
    var isNewRecord: Boolean
    var levelId: Int
    var score: Int
}
