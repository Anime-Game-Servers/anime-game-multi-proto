package data.scene.entity

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB2)
@ProtoModel
internal interface SceneEntityAiInfo {
    var isAiOpen: Boolean
    var bornPos: Vector
    var skillCdMap: Map<Int, Int>
    var servantInfo: ServantInfo
    var aiThreatMap: Map<Int, Int>
    var skillGroupCdMap: Map<Int, Int>
    var curTactic: Int
}
