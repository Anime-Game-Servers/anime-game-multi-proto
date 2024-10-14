package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.PropValue
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AvatarInfo {
    var avatarId: Int
    var guid: Long
    var propMap: Map<Int, PropValue>
    var lifeState: Int
    var equipGuidList: List<Long>
    var talentIdList: List<Int>
    var fightPropMap: Map<Int, Float>
    @RemovedIn(Version.GI_0_9_0)
    var isTrialAvatar: Boolean
    var trialAvatarInfo: TrialAvatarInfo
    var skillMap: Map<Int, AvatarSkillInfo>
    var skillDepotId: Int
    @AddedIn(Version.GI_CB2)
    var fetterInfo: AvatarFetterInfo
    @AddedIn(Version.GI_CB2)
    var coreProudSkillLevel: Int
    @AddedIn(Version.GI_CB2)
    var inherentProudSkillList: List<Int>
    @AddedIn(Version.GI_CB2)
    var skillLevelMap: Map<Int, Int>
    @AddedIn(Version.GI_CB2)
    var expeditionState: AvatarExpeditionState
    @AddedIn(Version.GI_CB2)
    var proudSkillExtraLevelMap: Map<Int, Int>
    @AddedIn(Version.GI_CB2)
    var isFocus: Boolean
    @AddedIn(Version.GI_0_9_0)
    var avatarType: Int
    @AddedIn(Version.GI_0_9_0)
    var teamResonanceList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var wearingFlycloakId: Int
    @AddedIn(Version.GI_1_0_0)
    var equipAffixList: List<AvatarEquipAffixInfo>
    @AddedIn(Version.GI_1_1_0)
    var bornTime: Int
    @AddedIn(Version.GI_1_2_0)
    var pendingPromoteRewardList: List<Int>
    @AddedIn(Version.GI_1_6_0)
    var costumeId: Int
    @AddedIn(Version.GI_1_6_0)
    var excelInfo: AvatarExcelInfo
    @AddedIn(Version.GI_2_1_0)
    var animHash: Int
}