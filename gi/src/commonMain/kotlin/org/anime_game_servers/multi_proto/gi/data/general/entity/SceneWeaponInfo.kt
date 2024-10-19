package org.anime_game_servers.multi_proto.gi.data.general.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityRendererChangedInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneWeaponInfo {
    var entityId: Int
    var gadgetId: Int
    var itemId: Int
    var guid: Long
    var level: Int
    var promoteLevel: Int
    var abilityInfo: AbilitySyncStateInfo
    var affixMap: Map<Int, Int>
    @AddedIn(Version.GI_2_6_0)
    var rendererChangedInfo: EntityRendererChangedInfo
}