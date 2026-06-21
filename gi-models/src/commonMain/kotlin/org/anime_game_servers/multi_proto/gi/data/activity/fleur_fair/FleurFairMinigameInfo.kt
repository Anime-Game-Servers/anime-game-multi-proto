package org.anime_game_servers.multi_proto.gi.data.activity.fleur_fair

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface FleurFairMinigameInfo {
    var isOpen: Boolean
    var minigameId: Int
    var openTime: Int
    
    @OneOf(
        types = [
            OneOfEntry(FleurFairBalloonInfo::class, "balloon_info"),
            OneOfEntry(FleurFairFallInfo::class, "fall_info"),
            OneOfEntry(FleurFairMusicGameInfo::class, "music_info"),
        ]
    )
    var detail: OneOfType
}
