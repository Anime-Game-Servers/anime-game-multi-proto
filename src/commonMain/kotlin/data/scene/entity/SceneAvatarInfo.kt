package data.scene.entity

import annotations.AddedIn
import data.general.ability.ServerBuff
import data.general.entity.SceneReliquaryInfo
import data.general.entity.SceneWeaponInfo
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneAvatarInfo {
    var uid: Int
    var avatarId: Int
    var guid: Long
    var peerId: Int
    var equipIdList: List<Int>
    var skillDepotId: Int
    var talentIdList: List<Int>
    var weapon: SceneWeaponInfo
    var reliquaryList: List<SceneReliquaryInfo>
    @AddedIn(VERSION.VCB2)
    var coreProudSkillLevel: Int
    @AddedIn(VERSION.VCB2)
    var inherentProudSkillList: List<Int>
    @AddedIn(VERSION.VCB2)
    var skillLevelMap: Map<Int, Int>
    @AddedIn(VERSION.VCB2)
    var proudSkillExtraLevelMap: Map<Int, Int>
    @AddedIn(VERSION.V0_9_0)
    var serverBuffList: List<ServerBuff>
    @AddedIn(VERSION.V0_9_0)
    var teamResonanceList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var wearingFlycloakId: Int
    @AddedIn(VERSION.V1_0_0)
    var bornTime: Int
    @AddedIn(VERSION.V1_6_0)
    var costumeId: Int
    @AddedIn(VERSION.V1_6_0)
    var curVehicleInfo: CurVehicleInfo
    @AddedIn(VERSION.V1_6_0)
    var excelInfo: AvatarExcelInfo
    @AddedIn(VERSION.V2_1_0)
    var animHash: Int
}
