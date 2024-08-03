package org.anime_game_servers.multi_proto.gi.data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface AbilityMixinWindSeedSpawner {
    
    @OneOf(
        types = [
            OneOfEntry(AddSignal::class, "add_signal"),
            OneOfEntry(CatchSeed::class, "catch_seed"),
            OneOfEntry(RefreshSeed::class, "refresh_seed"),
        ]
    )
    var cmd: OneOfType
}
