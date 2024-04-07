package data.ability.mixin

import data.general.ability.MassivePropSyncInfo
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface AbilityMixinScenePropSync {
    var deleteIdList: List<Long>
    var massivePropList: List<MassivePropSyncInfo>
    @AddedIn(GI_2_0_0)
    var isClearAll: Boolean
}
