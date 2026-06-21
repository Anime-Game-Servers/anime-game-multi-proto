package org.anime_game_servers.multi_proto.gi.data.community.player_presentation

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.REQUEST)
interface SetPlayerBirthdayReq {
    var birthday: Birthday
}