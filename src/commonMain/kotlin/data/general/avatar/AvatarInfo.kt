package data.general.avatar

import annotations.AddedIn
import annotations.RemovedIn
import data.general.PropValue
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AvatarInfo {
    var avatarId: Int
    var guid: Long
    var propMap: Map<Int, PropValue>
    var lifeState: Int
    var equipGuidList: List<Long>
    var talentIdList: List<Int>
    var fightPropMap: Map<Int, Float>
    @RemovedIn(VERSION.V0_9_0)
    var isTrialAvatar: Boolean
    var trialAvatarInfo: TrialAvatarInfo
    var skillMap: Map<Int, AvatarSkillInfo>
    var skillDepotId: Int
    @AddedIn(VERSION.VCB2)
    var fetterInfo: AvatarFetterInfo
    @AddedIn(VERSION.VCB2)
    var coreProudSkillLevel: Int
    @AddedIn(VERSION.VCB2)
    var inherentProudSkillList: List<Int>
    @AddedIn(VERSION.VCB2)
    var skillLevelMap: Map<Int, Int>
    @AddedIn(VERSION.VCB2)
    var expeditionState: AvatarExpeditionState
    @AddedIn(VERSION.VCB2)
    var proudSkillExtraLevelMap: Map<Int, Int>
    @AddedIn(VERSION.VCB2)
    var isFocus: Boolean
    @AddedIn(VERSION.V0_9_0)
    var avatarType: Int
    @AddedIn(VERSION.V0_9_0)
    var teamResonanceList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var wearingFlycloakId: Int
    @AddedIn(VERSION.V1_0_0)
    var equipAffixList: List<AvatarEquipAffixInfo>
    @AddedIn(VERSION.V1_1_0)
    var bornTime: Int
    @AddedIn(VERSION.V1_2_0)
    var pendingPromoteRewardList: List<Int>
    @AddedIn(VERSION.V1_6_0)
    var costumeId: Int
    @AddedIn(VERSION.V1_6_0)
    var excelInfo: AvatarExcelInfo
    @AddedIn(VERSION.V2_1_0)
    var animHash: Int
}