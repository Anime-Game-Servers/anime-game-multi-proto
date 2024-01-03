package data.general.avatar

import annotations.AddedIn
import data.general.PropValue
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
internal interface ShowAvatarInfo {
    var avatarId: Int
    var propMap: Map<Int, PropValue>
    var talentIdList: List<Int>
    var fightPropMap: Map<Int, Float>
    var skillDepotId: Int
    var coreProudSkillLevel: Int
    var inherentProudSkillList: List<Int>
    var skillLevelMap: Map<Int, Int>
    var proudSkillExtraLevelMap: Map<Int, Int>
    var equipList: List<ShowEquip>
    @AddedIn(VERSION.V1_4_0)
    var fetterInfo: AvatarFetterInfo
    @AddedIn(VERSION.V1_6_0)
    var costumeId: Int
    @AddedIn(VERSION.V1_6_0)
    var excelInfo: AvatarExcelInfo
}