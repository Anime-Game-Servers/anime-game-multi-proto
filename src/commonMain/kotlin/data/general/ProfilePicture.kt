package data.general

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface ProfilePicture {
    var avatarId: Int
    val costumeId: Int
}