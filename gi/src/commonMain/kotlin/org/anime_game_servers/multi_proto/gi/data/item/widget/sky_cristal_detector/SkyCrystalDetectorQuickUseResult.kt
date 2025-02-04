package org.anime_game_servers.multi_proto.gi.data.item.widget.sky_cristal_detector

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface SkyCrystalDetectorQuickUseResult {
    var retcode: Retcode
    var skyCrystalDetectorData: SkyCrystalDetectorData
}
