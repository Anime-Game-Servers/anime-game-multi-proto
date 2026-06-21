package org.anime_game_servers.multi_proto.gi.data.activity.op_activity

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface OpActivityInfo {
    var activityId: Int
    var beginTime: Int
    var endTime: Int
    var isHasChange: Boolean
    var scheduleId: Int
    
    @OneOf(
        types = [
            OneOfEntry(BonusOpActivityInfo::class, "bonus_info"),
        ]
    )
    var detail: OneOfType
}
