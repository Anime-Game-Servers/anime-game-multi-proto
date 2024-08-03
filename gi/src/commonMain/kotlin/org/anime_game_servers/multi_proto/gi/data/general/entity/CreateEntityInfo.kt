package org.anime_game_servers.multi_proto.gi.data.general.entity

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface CreateEntityInfo {
    var level: Int
    var pos: Vector
    var rot: Vector
    var dropId: Int
    var sceneId: Int
    var roomId: Int
    var clientUniqueId: Int
    @AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
    var alias: Long
    @AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
    var metaPathIndex: Int
    @AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
    var canCreateInOtherPlayerWorld: Boolean

    @OneOf(
        OneOfEntry(Int::class, "monster_id"),
        OneOfEntry(Int::class, "npc_id"),
        OneOfEntry(Int::class, "gadget_id"),
        OneOfEntry(Int::class, "item_id"),
    )
    var entity : OneOfType

    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.entity.CreateGadgetInfo::class, "gadget"),
    )
    var entityCreateInfo : OneOfType
}
