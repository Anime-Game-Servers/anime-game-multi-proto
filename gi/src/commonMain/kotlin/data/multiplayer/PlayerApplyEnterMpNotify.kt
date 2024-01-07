package data.multiplayer

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.PropValue
import data.general.item.Item
import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerApplyEnterMpNotify {
    var srcPlayerInfo: OnlinePlayerInfo
    @AddedIn(Version.GI_1_0_0)
    var srcAppId: Int
    @AddedIn(Version.GI_2_1_0)
    var srcThreadIndex: Int
}