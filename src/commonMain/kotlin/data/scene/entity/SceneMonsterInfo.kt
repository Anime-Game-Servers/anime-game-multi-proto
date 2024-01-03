package data.scene.entity

import annotations.AddedIn
import data.general.entity.SceneWeaponInfo
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneMonsterInfo {
    var monsterId: Int
    var groupId: Int
    var configId: Int
    var weaponList: List<SceneWeaponInfo>
    var authorityPeerId: Int
    var affixList: List<Int>
    var isElite: Boolean
    var ownerEntityId: Int
    var summonedTag: Int
    var summonTagMap: Map<Int, Int>
    var poseId: Int
    var bornType: MonsterBornType
    @AddedIn(VERSION.V0_9_0)
    var blockId: Int
    @AddedIn(VERSION.V0_9_0)
    var markFlag: Int
    @AddedIn(VERSION.V0_9_0)
    var titleId: Int
    @AddedIn(VERSION.V0_9_0)
    var specialNameId: Int
    @AddedIn(VERSION.V0_9_0)
    var attackTargetId: Int
    @AddedIn(VERSION.V1_3_0)
    var monsterRoute: MonsterRoute
    @AddedIn(VERSION.V1_3_0)
    var aiConfigId: Int
    @AddedIn(VERSION.V2_0_0)
    var levelRouteId: Int
    @AddedIn(VERSION.V2_2_0)
    var initPoseId: Int
    @AddedIn(VERSION.V2_8_0)
    var isLight: Boolean
    @AddedIn(VERSION.V3_0_0)
    var killNum: Int
    @AddedIn(VERSION.V2_1_0)
    @OneOf(
        OneOfEntry(SceneFishInfo::class, "fish_info"),
        OneOfEntry(FishtankFishInfo::class, "fishtank_fish_info")
    )
    var content: OneOfType
}
