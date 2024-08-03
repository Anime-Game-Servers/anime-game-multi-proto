package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ability.ServerBuff
import org.anime_game_servers.multi_proto.gi.data.general.entity.SceneReliquaryInfo
import org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface SceneAvatarInfo {
    var uid: Int
    var avatarId: Int
    var guid: Long
    var peerId: Int
    var equipIdList: List<Int>
    var skillDepotId: Int
    var talentIdList: List<Int>
    var weapon: org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo
    var reliquaryList: List<org.anime_game_servers.multi_proto.gi.data.general.entity.SceneReliquaryInfo>
    @AddedIn(Version.GI_CB2)
    var coreProudSkillLevel: Int
    @AddedIn(Version.GI_CB2)
    var inherentProudSkillList: List<Int>
    @AddedIn(Version.GI_CB2)
    var skillLevelMap: Map<Int, Int>
    @AddedIn(Version.GI_CB2)
    var proudSkillExtraLevelMap: Map<Int, Int>
    @AddedIn(Version.GI_0_9_0)
    var serverBuffList: List<org.anime_game_servers.multi_proto.gi.data.general.ability.ServerBuff>
    @AddedIn(Version.GI_0_9_0)
    var teamResonanceList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var wearingFlycloakId: Int
    @AddedIn(Version.GI_1_0_0)
    var bornTime: Int
    @AddedIn(Version.GI_1_6_0)
    var costumeId: Int
    @AddedIn(Version.GI_1_6_0)
    var curVehicleInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.CurVehicleInfo
    @AddedIn(Version.GI_1_6_0)
    var excelInfo: org.anime_game_servers.multi_proto.gi.data.scene.entity.AvatarExcelInfo
    @AddedIn(Version.GI_2_1_0)
    var animHash: Int
}
