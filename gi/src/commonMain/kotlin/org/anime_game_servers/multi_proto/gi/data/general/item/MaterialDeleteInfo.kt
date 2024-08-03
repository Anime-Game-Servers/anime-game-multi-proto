package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface MaterialDeleteInfo {
    var hasDeleteConfig: Boolean
    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.CountDownDelete::class, "count_down_delete"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.DateTimeDelete::class, "date_delete"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.DelayWeekCountDownDelete::class, "delay_week_count_down_delete")
    )
    var deleteInfo: OneOfType
}