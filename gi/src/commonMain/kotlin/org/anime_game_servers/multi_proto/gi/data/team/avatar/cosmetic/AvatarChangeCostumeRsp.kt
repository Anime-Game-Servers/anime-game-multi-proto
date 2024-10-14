package org.anime_game_servers.multi_proto.gi.data.team.avatar.cosmetic

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface AvatarChangeCostumeRsp {
    var retcode: Retcode
    var costumeId: Int
    var avatarGuid: Long
}