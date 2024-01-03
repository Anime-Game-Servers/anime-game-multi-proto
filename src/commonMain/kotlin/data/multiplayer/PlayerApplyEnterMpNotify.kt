package data.multiplayer

import annotations.AddedIn
import data.general.PropValue
import data.general.item.Item
import data.scene.entity.OnlinePlayerInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerApplyEnterMpNotify {
    var srcPlayerInfo: OnlinePlayerInfo
    @AddedIn(VERSION.V1_0_0)
    var srcAppId: Int
    @AddedIn(VERSION.V2_1_0)
    var srcThreadIndex: Int
}