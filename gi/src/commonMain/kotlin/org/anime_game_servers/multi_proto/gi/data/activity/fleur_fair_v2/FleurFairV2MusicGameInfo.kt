package org.anime_game_servers.multi_proto.gi.data.activity.fleur_fair_v2

import org.anime_game_servers.core.base.Version.GI_3_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.activity.music_game.MusicGameRecord

@AddedIn(GI_3_5_0)
@ProtoModel
internal interface FleurFairV2MusicGameInfo {
    var musicGameRecordMap: Map<Int, MusicGameRecord>
}