package data.scene

import annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB1
import messages.VERSION.V0_9_0

@AddedIn(VCB1)
@ProtoModel
internal interface AvatarEnterSceneInfo {
    var avatarGuid: Long
    var avatarEntityId: Int
    var avatarAbilityInfo: AbilitySyncStateInfo
    var buffIdList: List<Int>
    var weaponGuid: Long
    var weaponEntityId: Int
    var weaponAbilityInfo: AbilitySyncStateInfo
    @AddedIn(V0_9_0)
    var serverBuffList: List<ServerBuff>
}
