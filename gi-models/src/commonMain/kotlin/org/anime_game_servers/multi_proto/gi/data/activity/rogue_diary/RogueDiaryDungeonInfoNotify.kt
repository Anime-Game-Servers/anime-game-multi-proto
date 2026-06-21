package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_7_0)
@ProtoCommand(CLIENT)
internal interface RogueDiaryDungeonInfoNotify {
    var coin: Int
    var curRoom: Int
    var curRound: Int
    var difficulty: Int
    var dungeonId: Int
    var roomList: List<RogueDiaryRoomInfo>
    var roundCardList: List<Int>
    var roundMonsterList: List<Int>
    var stageId: Int
    var time: Int
}
