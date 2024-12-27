package org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_3_0_0)
@ProtoCommand(NOTIFY)
internal interface GravenInnocenceRaceSettleNotify {
    var challengeProgress: Int
    var coinCount: Int
    var galleryId: Int
    var isNewRecord: Boolean
    var isSuccess: Boolean
    var levelId: Int
    var reason: GalleryStopReason
    var remainTime: Int
    var score: Int
    @AltName("totalCointCount")
    var totalCoinCount: Int
}
