package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.gallery

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface HomeGroupRecord {
    var groupId: Int
    
    @OneOf(
        types = [
            OneOfEntry(HomeRacingRecord::class, "racing_gallery_info"),
            OneOfEntry(HomeBalloonRecord::class, "balloon_gallery_info"),
            OneOfEntry(HomeStakeRecord::class, "stake_play_info"),
            OneOfEntry(HomeSeekFurnitureAllRecord::class, "seek_furniture_gallery_info"),
        ]
    )
    var detail: OneOfType
}
