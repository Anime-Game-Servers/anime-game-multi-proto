package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface SceneEntityAiInfo {
    var isAiOpen: Boolean
    var bornPos: Vector
    var skillCdMap: Map<Int, Int>
    var servantInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.ServantInfo
    var aiThreatMap: Map<Int, Int>
    var skillGroupCdMap: Map<Int, Int>
    var curTactic: Int
}
