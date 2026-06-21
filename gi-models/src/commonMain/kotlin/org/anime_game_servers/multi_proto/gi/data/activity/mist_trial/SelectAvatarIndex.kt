package org.anime_game_servers.multi_proto.gi.data.activity.mist_trial

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel(parentClass = "MistTrialSelectAvatarAndEnterDungeonReq")
internal interface SelectAvatarIndex {
    
    @AddedIn(GI_3_4_0)
    @OneOf(
        types = [
            OneOfEntry(Long::class, "formal_avatar_guid"),
            OneOfEntry(Int::class, "mist_trial_avatar_id"),
        ]
    )
    var detail: OneOfType
}
