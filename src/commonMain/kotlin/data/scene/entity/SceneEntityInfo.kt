package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import data.general.PropValue
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB2
import messages.VERSION.V0_9_0
import messages.VERSION.V1_0_0
import messages.VERSION.V1_2_0
import messages.VERSION.V1_3_0
import messages.VERSION.V1_4_0
import messages.VERSION.V2_2_0

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneEntityInfo {
    var entityType: ProtEntityType
    var entityId: Int
    var name: String
    var motionInfo: MotionInfo
    @RemovedIn(V1_0_0)
    var propMap: Map<Int, PropValue>
    @AddedIn(V1_0_0)
    var propList: List<PropPair>
    @RemovedIn(V1_0_0)
    var fightPropMap: Map<Int, Float>
    @AddedIn(V1_0_0)
    var fightPropList: List<FightPropPair>
    var lifeState: Int
    @RemovedIn(V1_3_0)
    var abilityInfo: AbilitySyncStateInfo
    @RemovedIn(V1_0_0)
    var animatorParaMap: Map<Int, AnimatorParameterValueInfo>
    @AddedIn(V1_0_0)
    var animatorParaList: List<AnimatorParameterValueInfoPair>
    @RemovedIn(V0_9_0)
    var questInfo: SceneEntityQuestInfo
    @RemovedIn(V1_3_0)
    var rendererChangeInfo: EntityRendererChangedInfo
    @AddedIn(V1_3_0)
    var aiInfo: SceneEntityAiInfo
    @AddedIn(VCB2)
    var lastMoveSceneTimeMs: Int
    @AddedIn(VCB2)
    var lastMoveReliableSeq: Int
    @AddedIn(V0_9_0)
    var entityClientData: EntityClientData
    @AddedIn(V1_2_0)
    var entityEnvironmentInfoList: List<EntityEnvironmentInfo>
    @AddedIn(V1_3_0)
    var entityAuthorityInfo: EntityAuthorityInfo
    @AddedIn(V1_4_0)
    var tagList: List<String>
    @AddedIn(V2_2_0)
    var serverBuffList: List<ServerBuff>

    @OneOf(
        OneOfEntry(SceneAvatarInfo::class, "avatar"),
        OneOfEntry(SceneMonsterInfo::class, "monster"),
        OneOfEntry(SceneNpcInfo::class, "npc"),
        OneOfEntry(SceneGadgetInfo::class, "gadget"),
    )
    var entity: OneOfType
}
