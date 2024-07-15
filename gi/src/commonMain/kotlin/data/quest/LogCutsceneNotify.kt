package data.quest

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@RemovedIn(GI_0_9_0)
@ProtoCommand(CLIENT)
internal interface LogCutsceneNotify {
    var cutsceneName: String
    var isSkip: Boolean
    var isStart: Boolean
}
