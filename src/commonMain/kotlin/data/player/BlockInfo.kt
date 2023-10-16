package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V0_9_0)
@ProtoModel
interface BlockInfo {
    var blockId: Int
    var dataVersion: Int
    var binData: ByteArray
    var isDirty: Boolean
}
