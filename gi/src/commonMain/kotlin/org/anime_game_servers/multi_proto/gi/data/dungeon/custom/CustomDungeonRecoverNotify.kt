package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_5_0)
@ProtoCommand(NOTIFY)
internal interface CustomDungeonRecoverNotify {
    var customDungeon: CustomDungeon
    var enterType: EnterCustomDungeonType
    var officialBlackCoinList: List<Int>
    var tryType: TryCustomDungeonType
}
