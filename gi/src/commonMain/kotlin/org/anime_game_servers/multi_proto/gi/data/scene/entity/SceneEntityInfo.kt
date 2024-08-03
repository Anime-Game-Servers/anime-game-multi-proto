package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.PropValue
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.multi_proto.gi.data.general.ability.ServerBuff
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_2_0

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneEntityInfo {
    var entityType: org.anime_game_servers.multi_proto.gi.data.scene.entity.ProtEntityType
    var entityId: Int
    var name: String
    var motionInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.MotionInfo
    @RemovedIn(GI_1_0_0)
    var propMap: Map<Int, PropValue>
    @AddedIn(GI_1_0_0)
    var propList: List<org.anime_game_servers.multi_proto.gi.data.scene.entity.PropPair>
    @RemovedIn(GI_1_0_0)
    var fightPropMap: Map<Int, Float>
    @AddedIn(GI_1_0_0)
    var fightPropList: List<org.anime_game_servers.multi_proto.gi.data.scene.entity.FightPropPair>
    var lifeState: Int
    @RemovedIn(GI_1_3_0)
    var abilityInfo: org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
    @RemovedIn(GI_1_0_0)
    var animatorParaMap: Map<Int, org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfo>
    @AddedIn(GI_1_0_0)
    var animatorParaList: List<org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfoPair>
    @RemovedIn(GI_0_9_0)
    var questInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityQuestInfo
    @RemovedIn(GI_1_3_0)
    var rendererChangeInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityRendererChangedInfo
    @AddedIn(GI_1_3_0)
    var aiInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityAiInfo
    @AddedIn(GI_CB2)
    var lastMoveSceneTimeMs: Int
    @AddedIn(GI_CB2)
    var lastMoveReliableSeq: Int
    @AddedIn(GI_0_9_0)
    var entityClientData: org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityClientData
    @AddedIn(GI_1_2_0)
    var entityEnvironmentInfoList: List<org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityEnvironmentInfo>
    @AddedIn(GI_1_3_0)
    var entityAuthorityInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.EntityAuthorityInfo
    @AddedIn(GI_1_4_0)
    var tagList: List<String>
    @AddedIn(GI_2_2_0)
    var serverBuffList: List<org.anime_game_servers.multi_proto.gi.data.general.ability.ServerBuff>

    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneAvatarInfo::class, "avatar"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneMonsterInfo::class, "monster"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneNpcInfo::class, "npc"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneGadgetInfo::class, "gadget"),
    )
    var entity: OneOfType
}
