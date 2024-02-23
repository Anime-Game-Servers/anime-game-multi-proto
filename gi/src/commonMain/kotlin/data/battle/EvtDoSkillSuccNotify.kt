package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface EvtDoSkillSuccNotify {
    var forwardType: ForwardType
    var casterId: Int
    var skillId: Int
    var forward: Vector
}
