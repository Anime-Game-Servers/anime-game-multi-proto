package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_1_0)
@ProtoModel
internal interface SceneGalleryVintageHuntingInfo {
    var stageId: Int

    @OneOf(
        OneOfEntry(VintageHuntingFirstStageInfo::class, "first_stage_info"),
        OneOfEntry(VintageHuntingSecondStageInfo::class, "second_stage_info"),
        OneOfEntry(VintageHuntingThirdStageInfo::class, "third_stage_info"),
    )
    var info: OneOfType
}