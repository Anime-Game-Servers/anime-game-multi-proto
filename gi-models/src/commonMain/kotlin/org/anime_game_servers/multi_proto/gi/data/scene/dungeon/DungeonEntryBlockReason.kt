package org.anime_game_servers.multi_proto.gi.data.scene.dungeon

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class DungeonEntryBlockReason {
    @AltName("DUNGEON_ENTRY_BLOCK_REASON_NONE")
    DUNGEON_ENTRY_REASON_NONE,
    @AltName("DUNGEON_ENTRY_BLOCK_REASON_LEVEL")
    DUNGEON_ENTRY_REASON_LEVEL,
    @AltName("DUNGEON_ENTRY_BLOCK_REASON_QUEST")
    DUNGEON_ENTRY_REASON_QUEST,
    @AltName("DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE", "DUNGEON_ENTRY_REASON_MULIPLE")
    DUNGEON_ENTRY_REASON_MULTIPLE,
}
