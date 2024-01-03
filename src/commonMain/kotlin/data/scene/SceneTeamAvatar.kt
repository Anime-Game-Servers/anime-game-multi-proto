package data.scene

import annotations.AddedIn
import data.general.ability.AbilityControlBlock
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
import data.general.avatar.AvatarInfo
import data.scene.entity.SceneAvatarInfo
import data.scene.entity.SceneEntityInfo
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_0_0
import messages.VERSION.V1_1_0

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface SceneTeamAvatar {
    var playerUid: Int
    var avatarGuid: Long
    var sceneId: Int
    var entityId: Int
    var avatarInfo: AvatarInfo
    var sceneAvatarInfo: SceneAvatarInfo
    @AddedIn(V1_0_0)
    var avatarAbilityInfo: AbilitySyncStateInfo
    @AddedIn(V1_0_0)
    var serverBuffList: List<ServerBuff>
    @AddedIn(V1_0_0)
    var weaponGuid: Long
    @AddedIn(V1_0_0)
    var weaponEntityId: Int
    @AddedIn(V1_0_0)
    var weaponAbilityInfo: AbilitySyncStateInfo
    @AddedIn(V1_0_0)
    var abilityControlBlock: AbilityControlBlock
    @AddedIn(V1_0_0)
    var isReconnect: Boolean
    @AddedIn(V1_1_0)
    var sceneEntityInfo: SceneEntityInfo
    @AddedIn(V1_1_0)
    var isOnScene: Boolean
    @AddedIn(V1_1_0)
    var isPlayerCurAvatar: Boolean
}
