package org.anime_game_servers.multi_proto.gi.data.community.player_presentation

import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(CLIENT)
internal interface ProfilePictureChangeNotify {
    var profilePicture: ProfilePicture
}
