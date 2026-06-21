package org.anime_game_servers.multi_proto.gi.data.ability.mixin

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutMixinSyncType
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutSyncAction
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutSyncCreateConnect
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutSyncFinishGame
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutSyncPing
import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutSyncSnapShot

@AddedIn(Version.GI_3_3_0)
@ProtoModel
internal interface AbilityMixinBreakout {
    var retcode: Int
    var syncType: BreakoutMixinSyncType

    @OneOf(
        types = [
            OneOfEntry(BreakoutSyncAction::class, "sync_action"),
            OneOfEntry(BreakoutSyncCreateConnect::class, "sync_create_connect"),
            OneOfEntry(BreakoutSyncFinishGame::class, "sync_finish_game"),
            OneOfEntry(BreakoutSyncPing::class, "sync_ping"),
            OneOfEntry(BreakoutSyncSnapShot::class, "sync_snap_shot"),
        ]
    )
    var sync: OneOfType
}