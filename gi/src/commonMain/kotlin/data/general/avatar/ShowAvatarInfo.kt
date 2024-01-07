package data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.PropValue
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
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
    @AddedIn(Version.GI_1_4_0)
    var fetterInfo: AvatarFetterInfo
    @AddedIn(Version.GI_1_6_0)
    var costumeId: Int
    @AddedIn(Version.GI_1_6_0)
    var excelInfo: AvatarExcelInfo
}