package data.general.ability

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_5_0)
@ProtoModel
internal interface MassivePropSyncInfo {
    var id: Long
    var propList: List<MassivePropParam>
}