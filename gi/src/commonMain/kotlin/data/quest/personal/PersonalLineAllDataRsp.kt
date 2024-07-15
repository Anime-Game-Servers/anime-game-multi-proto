package data.quest.personal

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface PersonalLineAllDataRsp {
    var canBeUnlockedPersonalLineList: List<Int>
    var curFinishedDailyTaskCount: Int
    var legendaryKeyCount: Int
    var lockedPersonalLineList: List<LockedPersonalLineData>
    var ongoingPersonalLineList: List<Int>
    var retCode: Int
}
