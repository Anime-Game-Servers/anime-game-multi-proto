package data.general.entity

import annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import data.scene.entity.EntityRendererChangedInfo
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
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
    @AddedIn(VERSION.V2_6_0)
    var rendererChangedInfo: EntityRendererChangedInfo
}