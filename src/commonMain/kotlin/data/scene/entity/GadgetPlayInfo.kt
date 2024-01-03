package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface GadgetPlayInfo {
    var playType: Int
    var duration: Int
    var progressStageList: List<Int>
    var startCd: Int
    var startTime: Int
    var progress: Int

    @OneOf(
        OneOfEntry(GadgetCrucibleInfo::class, "crucible_info"),
    )
    var playInfo: OneOfType
}
