package data.team

import annotations.AddedIn
import data.general.avatar.AvatarInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.VCB2
import messages.VERSION.V1_0_0
import messages.VERSION.V1_6_0
import messages.VERSION.V3_0_0

@AddedIn(VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarDataNotify {
    var avatarList: List<AvatarInfo>
    var avatarTeamMap: Map<Int, AvatarTeam>
    var curAvatarTeamId: Int
    var chooseAvatarGuid: Long
    var tempAvatarGuidList: List<Long>
    @AddedIn(V1_0_0)
    var ownedFlycloakList: List<Int>
    @AddedIn(V1_6_0)
    var ownedCostumeList: List<Int>
    @AddedIn(V3_0_0)
    var backupAvatarTeamOrderList: List<Int>
}
