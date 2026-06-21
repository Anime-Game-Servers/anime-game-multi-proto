package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface ProfilePicture {
    var avatarId: Int
    val costumeId: Int
}