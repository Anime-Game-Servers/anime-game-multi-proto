package org.anime_game_servers.multi_proto.gi.data.community

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_1_3_0)
@ProtoCommand(CommandType.REQUEST)
interface SocialShowAvatarInfo {
    var avatarId: Int
    var level: Int
    @AddedIn(Version.GI_1_6_0)
    var costumeId: Int
}