package org.anime_game_servers.multi_proto.gi.data.community.player_presentation

import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface SetPlayerHeadImageRsp {
    var avatarId: Int
    var retcode: Int
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}
