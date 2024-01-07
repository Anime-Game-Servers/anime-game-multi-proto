package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.widget.PlayerWidgetInfo
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_3_0_0

@AddedIn(GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorldPlayerInfoNotify {
    var playerInfoList : List<OnlinePlayerInfo>
    var playerUidList : List<Int>
    @AddedIn(GI_3_0_0)
    var playerWidgetInfoList : List<PlayerWidgetInfo>
}