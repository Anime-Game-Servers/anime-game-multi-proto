package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
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
