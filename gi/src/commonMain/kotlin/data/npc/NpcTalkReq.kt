package data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
internal interface NpcTalkReq {
    var npcEntityId: Int
    @RemovedIn(Version.GI_0_9_0)
    var talkType: NpcTalkType
    var talkId: Int
    @AddedIn(Version.GI_1_4_0)
    var entityId: Int
}
