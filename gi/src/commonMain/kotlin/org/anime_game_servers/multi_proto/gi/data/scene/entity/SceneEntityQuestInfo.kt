package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@RemovedIn(Version.GI_0_9_0)
@ProtoModel
internal interface SceneEntityQuestInfo {
    var alias: Long
    var metaPathIndex: Int
}
