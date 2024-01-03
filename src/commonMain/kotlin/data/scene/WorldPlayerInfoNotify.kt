package data.scene

import annotations.AddedIn
import data.general.widget.PlayerWidgetInfo
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.VCB2
import messages.VERSION.V3_0_0

@AddedIn(VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorldPlayerInfoNotify {
    var playerInfoList : List<OnlinePlayerInfo>
    var playerUidList : List<Int>
    @AddedIn(V3_0_0)
    var playerWidgetInfoList : List<PlayerWidgetInfo>
}