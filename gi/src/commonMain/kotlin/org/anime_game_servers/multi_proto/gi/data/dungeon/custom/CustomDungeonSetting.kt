package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface CustomDungeonSetting {
    var coinLimit: Int
    var isArriveFinish: Boolean
    var isForbidSkill: Boolean
    var lifeNum: Int
    var openRoomList: List<Int>
    var startRoomId: Int
    var timeLimit: Int
}
