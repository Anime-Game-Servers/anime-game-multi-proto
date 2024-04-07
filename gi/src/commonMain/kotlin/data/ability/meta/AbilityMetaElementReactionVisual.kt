package data.ability.meta

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface AbilityMetaElementReactionVisual {
    var elementReactionType: Int
    @AddedIn(GI_1_0_0)
    var elementReactorType: Int
    @AddedIn(GI_1_0_0)
    var elementSourceType: Int
    @AddedIn(GI_1_4_0)
    var hitIndex: Int
}
