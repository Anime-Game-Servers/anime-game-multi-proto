package data.scene

import annotations.AddedIn
import annotations.RemovedIn
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB2
import messages.VERSION.V1_0_0

@AddedIn(VCB2) @RemovedIn(V1_0_0)
@ProtoModel
internal interface MPDisplayCurAvatar {
    var playerUid: Int
    var avatarGuid: Long
    var lifeState: Int
    var fightPropMap: Map<Int, Float>
}
