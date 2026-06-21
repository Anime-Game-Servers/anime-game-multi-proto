package org.anime_game_servers.multi_proto.gi.data.gallery.wind_field

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_1_0)
@ProtoCommand(NOTIFY)
internal interface WindFieldGalleryChallengeInfoNotify {
    var challengeBallCurCount: Int
    var challengeBallMaxCount: Int
    var challengeTimestamp: Int
    var challengeTotalTime: Int
    var isStart: Boolean
    var isSuccess: Boolean
    var showId: Int
}
