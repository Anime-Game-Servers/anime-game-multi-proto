package org.anime_game_servers.multi_proto.gi.data.activity.vintage

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_1_0)
@ProtoCommand(NOTIFY)
internal interface SceneGalleryVintageHuntingSettleNotify {
    var finishedWatcherNum: Int
    var hasNewWatcher: Boolean
    var isNewRecord: Boolean
    var stageId: Int
    var totalWatcherNum: Int
    
    @OneOf(
        types = [
            OneOfEntry(VintageHuntingFirstStageSettleInfo::class, "first_stage_info"),
            OneOfEntry(VintageHuntingSecondStageSettleInfo::class, "second_stage_info"),
            OneOfEntry(VintageHuntingThirdStageSettleInfo::class, "third_stage_info"),
        ]
    )
    var info: OneOfType
}
