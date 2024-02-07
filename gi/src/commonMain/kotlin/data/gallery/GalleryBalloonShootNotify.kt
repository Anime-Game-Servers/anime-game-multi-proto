package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.*

@AddedIn(Version.GI_1_4_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GalleryBalloonShootNotify {
    var galleryId: Int
    var addScore: Int
    var combo: Int
    var comboDisableTime: Long
    var curScore: Int
    var triggerEntityId: Int
}