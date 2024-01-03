package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface MaterialDeleteInfo {
    var hasDeleteConfig: Boolean
    @OneOf(
        OneOfEntry(CountDownDelete::class, "count_down_delete"),
        OneOfEntry(DateTimeDelete::class, "date_delete"),
        OneOfEntry(DelayWeekCountDownDelete::class, "delay_week_count_down_delete")
    )
    var deleteInfo: OneOfType
}