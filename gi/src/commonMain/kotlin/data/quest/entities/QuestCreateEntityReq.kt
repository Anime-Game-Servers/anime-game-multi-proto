package data.quest.entities

import data.general.entity.CreateEntityInfo
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
internal interface QuestCreateEntityReq {
    var entity: CreateEntityInfo
    var questId: Int
    var isRewind: Boolean
    @AddedIn(Version.GI_0_9_0)
    var parentQuestId: Int
}