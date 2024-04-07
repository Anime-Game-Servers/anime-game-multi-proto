package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityMixinWindZone {
    var entityIds: List<Int>
    @AddedIn(GI_1_1_0)
    var zoneIdList: List<Int>
}
