package data.team.avatar.cosmetic

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface AvatarWearFlycloakRsp {
    var avatarGuid: Long
    var flycloakId: Int
    var retcode: Int
}
