package data.ability

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface WindSeedClientNotify {
    
    @OneOf(
        types = [
            OneOfEntry(AddWindBulletNotify::class, "add_wind_bullet_notify"),
            OneOfEntry(AreaNotify::class, "area_notify"),
            OneOfEntry(RefreshNotify::class, "refresh_notify"),
        ]
    )
    var notify: OneOfType
}
