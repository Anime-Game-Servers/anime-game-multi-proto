package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityAuthorityInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityRendererChangedInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityAiInfo
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
    var abilityInfo: org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
    @RemovedIn(GI_1_5_0)
    var authorityPeerId: Int
    @RemovedIn(GI_1_5_0)
    var entityId: Int
    @AddedIn(GI_CB2)
    @RemovedIn(GI_1_3_0)
    var rendererChangedInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityRendererChangedInfo
    @AddedIn(GI_1_1_0)
    @RemovedIn(GI_1_3_0)
    var aiInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityAiInfo
    @AddedIn(GI_1_3_0)
    @RemovedIn(GI_1_5_0)
    var entityAuthorityInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityAuthorityInfo
    @AddedIn(GI_1_5_0)
    var authorityChangeList: List<org.anime_game_servers.multi_proto.gi.data.battle.AuthorityChange>
}
