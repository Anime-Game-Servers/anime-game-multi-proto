package org.anime_game_servers.multi_proto.gi.data.other.ai_snapshot

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface AISnapshotInfo {
    var aiSnapshots: List<AISnapshotEntityData>
}
