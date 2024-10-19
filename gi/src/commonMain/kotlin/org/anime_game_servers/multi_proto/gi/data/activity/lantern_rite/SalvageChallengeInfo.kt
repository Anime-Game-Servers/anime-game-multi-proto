package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface SalvageChallengeInfo {
    var challengeType: Int
    var isUnlock: Boolean
    
    @OneOf(
        types = [
            OneOfEntry(Int::class, "boss_challenge_id"),
            OneOfEntry(SalvageBundleChallengeInfo::class, "bundle_info"),
            OneOfEntry(SalvageScoreChallengeInfo::class, "score_challenge_info"),
        ]
    )
    var challenge_detail: OneOfType
}
