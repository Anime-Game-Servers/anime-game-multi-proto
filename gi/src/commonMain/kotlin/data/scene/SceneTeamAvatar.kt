package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.ability.AbilityControlBlock
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
import data.general.avatar.AvatarInfo
import data.scene.entity.SceneAvatarInfo
import data.scene.entity.SceneEntityInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface SceneTeamAvatar {
    var playerUid: Int
    var avatarGuid: Long
    var sceneId: Int
    var entityId: Int
    var avatarInfo: AvatarInfo
    var sceneAvatarInfo: SceneAvatarInfo
    @AddedIn(GI_1_0_0)
    var avatarAbilityInfo: AbilitySyncStateInfo
    @AddedIn(GI_1_0_0)
    var serverBuffList: List<ServerBuff>
    @AddedIn(GI_1_0_0)
    var weaponGuid: Long
    @AddedIn(GI_1_0_0)
    var weaponEntityId: Int
    @AddedIn(GI_1_0_0)
    var weaponAbilityInfo: AbilitySyncStateInfo
    @AddedIn(GI_1_0_0)
    var abilityControlBlock: AbilityControlBlock
    @AddedIn(GI_1_0_0)
    var isReconnect: Boolean
    @AddedIn(GI_1_1_0)
    var sceneEntityInfo: SceneEntityInfo
    @AddedIn(GI_1_1_0)
    var isOnScene: Boolean
    @AddedIn(GI_1_1_0)
    var isPlayerCurAvatar: Boolean
}
