package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_0_9_0

@AddedIn(GI_CB1)
@ProtoModel
internal interface AvatarEnterSceneInfo {
    var avatarGuid: Long
    var avatarEntityId: Int
    var avatarAbilityInfo: AbilitySyncStateInfo
    var buffIdList: List<Int>
    var weaponGuid: Long
    var weaponEntityId: Int
    var weaponAbilityInfo: AbilitySyncStateInfo
    @AddedIn(GI_0_9_0)
    var serverBuffList: List<ServerBuff>
}
