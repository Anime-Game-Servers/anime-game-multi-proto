package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_5_0)
@ProtoModel
internal interface MassivePropSyncInfo {
    var id: Long
    var propList: List<org.anime_game_servers.multi_proto.gi.data.general.ability.MassivePropParam>
}