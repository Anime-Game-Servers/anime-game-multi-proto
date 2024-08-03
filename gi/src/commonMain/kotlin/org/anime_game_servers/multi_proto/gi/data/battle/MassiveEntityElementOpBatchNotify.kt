package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.multi_proto.gi.data.general.battle.ShapeBox
import org.anime_game_servers.multi_proto.gi.data.general.battle.ShapeSphere
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(CLIENT)
internal interface MassiveEntityElementOpBatchNotify {
    var attackElementDurability: Float
    var attackerId: Int
    var entityType: Int
    var reactionSourceType: Int
    var sourceElementType: Int
    var userId: Int
    @AddedIn(GI_1_5_0)
    var opIdx: Int
    
    @OneOf(
        types = [
            OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.battle.ShapeBox::class, "shape_box"),
            OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.battle.ShapeSphere::class, "shape_sphere"),
        ]
    )
    var checkShape: OneOfType
}
