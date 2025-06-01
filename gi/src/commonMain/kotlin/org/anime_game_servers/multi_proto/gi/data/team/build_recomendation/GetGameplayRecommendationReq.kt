package org.anime_game_servers.multi_proto.gi.data.team.build_recomendation

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_7_0)
@ProtoCommand(REQUEST)
internal interface GetGameplayRecommendationReq {
    var avatarId: Int
    
    @OneOf(
        types = [
            OneOfEntry(GameplayRecommendationReliquaryRequest::class, "reliquary_request"),
            OneOfEntry(GameplayRecommendationSkillRequest::class, "skill_request"),
            OneOfEntry(GameplayRecommendationElementReliquaryRequest::class, "element_reliquary_request", addedIn = GI_2_8_0),
        ]
    )
    var detail: OneOfType
}
