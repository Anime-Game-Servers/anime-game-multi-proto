package data.team

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.avatar.AvatarInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_3_0_0

@AddedIn(GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarDataNotify {
    var avatarList: List<AvatarInfo>
    var avatarTeamMap: Map<Int, AvatarTeam>
    var curAvatarTeamId: Int
    var chooseAvatarGuid: Long
    var tempAvatarGuidList: List<Long>
    @AddedIn(GI_1_0_0)
    var ownedFlycloakList: List<Int>
    @AddedIn(GI_1_6_0)
    var ownedCostumeList: List<Int>
    @AddedIn(GI_3_0_0)
    var backupAvatarTeamOrderList: List<Int>
}
