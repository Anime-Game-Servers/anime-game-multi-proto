package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@RemovedIn(VERSION.V0_9_0)
@ProtoModel
internal interface SceneEntityQuestInfo {
    var alias: Long
    var metaPathIndex: Int
}
