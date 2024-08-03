package data.community.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
interface ChatInfo {
    var time: Int
    var uid: Int
    @AddedIn(Version.GI_1_2_0)
    var sequence: Int
    @AddedIn(Version.GI_1_2_0)
    var toUid: Int
    @AddedIn(Version.GI_1_2_0)
    var isRead: Boolean

    @OneOf(
        OneOfEntry(String::class, "text"),
        OneOfEntry(Int::class, "icon"),
        OneOfEntry(SystemHint::class, "system_hint")
    )
    var content:OneOfType
}