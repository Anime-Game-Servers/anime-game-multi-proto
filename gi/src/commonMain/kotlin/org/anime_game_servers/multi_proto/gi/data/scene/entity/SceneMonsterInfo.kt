package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneMonsterInfo {
    var monsterId: Int
    var groupId: Int
    var configId: Int
    var weaponList: List<org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo>
    var authorityPeerId: Int
    var affixList: List<Int>
    var isElite: Boolean
    var ownerEntityId: Int
    var summonedTag: Int
    var summonTagMap: Map<Int, Int>
    var poseId: Int
    var bornType: org.anime_game_servers.multi_proto.gi.data.scene.entity.MonsterBornType
    @AddedIn(Version.GI_0_9_0)
    var blockId: Int
    @AddedIn(Version.GI_0_9_0)
    var markFlag: Int
    @AddedIn(Version.GI_0_9_0)
    var titleId: Int
    @AddedIn(Version.GI_0_9_0)
    var specialNameId: Int
    @AddedIn(Version.GI_0_9_0)
    var attackTargetId: Int
    @AddedIn(Version.GI_1_3_0)
    var monsterRoute: org.anime_game_servers.multi_proto.gi.data.scene.entity.MonsterRoute
    @AddedIn(Version.GI_1_3_0)
    var aiConfigId: Int
    @AddedIn(Version.GI_2_0_0)
    var levelRouteId: Int
    @AddedIn(Version.GI_2_2_0)
    var initPoseId: Int
    @AddedIn(Version.GI_2_8_0)
    var isLight: Boolean
    @AddedIn(Version.GI_3_0_0)
    var killNum: Int
    @AddedIn(Version.GI_2_1_0)
    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneFishInfo::class, "fish_info"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.scene.entity.FishtankFishInfo::class, "fishtank_fish_info")
    )
    var content: OneOfType
}
