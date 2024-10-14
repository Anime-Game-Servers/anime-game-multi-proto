package org.anime_game_servers.multi_proto.gi.data.quest.entities

import org.anime_game_servers.multi_proto.gi.data.general.entity.CreateEntityInfo
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface QuestCreateEntityRsp {
    var retCode: Retcode
    var entityId: Int
    var entity: CreateEntityInfo
    var questId: Int
    var isRewind: Boolean
    @AddedIn(GI_0_9_0)
    var parentQuestId: Int
}