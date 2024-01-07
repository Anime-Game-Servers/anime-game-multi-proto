package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import data.general.PropValue
import data.general.ability.AbilitySyncStateInfo
import data.general.ability.ServerBuff
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
    var entityType: ProtEntityType
    var entityId: Int
    var name: String
    var motionInfo: MotionInfo
    @RemovedIn(GI_1_0_0)
    var propMap: Map<Int, PropValue>
    @AddedIn(GI_1_0_0)
    var propList: List<PropPair>
    @RemovedIn(GI_1_0_0)
    var fightPropMap: Map<Int, Float>
    @AddedIn(GI_1_0_0)
    var fightPropList: List<FightPropPair>
    var lifeState: Int
    @RemovedIn(GI_1_3_0)
    var abilityInfo: AbilitySyncStateInfo
    @RemovedIn(GI_1_0_0)
    var animatorParaMap: Map<Int, AnimatorParameterValueInfo>
    @AddedIn(GI_1_0_0)
    var animatorParaList: List<AnimatorParameterValueInfoPair>
    @RemovedIn(GI_0_9_0)
    var questInfo: SceneEntityQuestInfo
    @RemovedIn(GI_1_3_0)
    var rendererChangeInfo: EntityRendererChangedInfo
    @AddedIn(GI_1_3_0)
    var aiInfo: SceneEntityAiInfo
    @AddedIn(GI_CB2)
    var lastMoveSceneTimeMs: Int
    @AddedIn(GI_CB2)
    var lastMoveReliableSeq: Int
    @AddedIn(GI_0_9_0)
    var entityClientData: EntityClientData
    @AddedIn(GI_1_2_0)
    var entityEnvironmentInfoList: List<EntityEnvironmentInfo>
    @AddedIn(GI_1_3_0)
    var entityAuthorityInfo: EntityAuthorityInfo
    @AddedIn(GI_1_4_0)
    var tagList: List<String>
    @AddedIn(GI_2_2_0)
    var serverBuffList: List<ServerBuff>

    @OneOf(
        OneOfEntry(SceneAvatarInfo::class, "avatar"),
        OneOfEntry(SceneMonsterInfo::class, "monster"),
        OneOfEntry(SceneNpcInfo::class, "npc"),
        OneOfEntry(SceneGadgetInfo::class, "gadget"),
    )
    var entity: OneOfType
}
