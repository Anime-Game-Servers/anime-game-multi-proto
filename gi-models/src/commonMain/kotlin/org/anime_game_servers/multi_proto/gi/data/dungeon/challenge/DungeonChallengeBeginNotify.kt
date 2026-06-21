package org.anime_game_servers.multi_proto.gi.data.dungeon.challenge

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface DungeonChallengeBeginNotify {
    var challengeId: Int
    var challengeIndex: Int
    var paramList: List<Int>
    @AddedIn(GI_1_0_0)
    var groupId: Int
    @AddedIn(GI_1_1_0)
    var fatherIndex: Int
    @AddedIn(GI_1_1_0)
    var uidList: List<Int>
}
