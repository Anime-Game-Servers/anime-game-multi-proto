package data.battle

import data.general.ability.AbilitySyncStateInfo
import data.scene.entity.EntityAuthorityInfo
import data.scene.entity.EntityRendererChangedInfo
import data.scene.entity.SceneEntityAiInfo
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EntityAuthorityChangeNotify {
    @RemovedIn(GI_1_3_0)
    var abilityInfo: AbilitySyncStateInfo
    @RemovedIn(GI_1_5_0)
    var authorityPeerId: Int
    @RemovedIn(GI_1_5_0)
    var entityId: Int
    @AddedIn(GI_CB2)
    @RemovedIn(GI_1_3_0)
    var rendererChangedInfo: EntityRendererChangedInfo
    @AddedIn(GI_1_1_0)
    @RemovedIn(GI_1_3_0)
    var aiInfo: SceneEntityAiInfo
    @AddedIn(GI_1_3_0)
    @RemovedIn(GI_1_5_0)
    var entityAuthorityInfo: EntityAuthorityInfo
    @AddedIn(GI_1_5_0)
    var authorityChangeList: List<AuthorityChange>
}
