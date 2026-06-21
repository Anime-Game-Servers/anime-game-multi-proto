package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class SvrMsgId {
    @AltName("SVR_MSG_ID_UNKNOWN")
    MSG_UNKNOWN,
    @AltName("SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN")
    MSG_BLOCK_REFRESH_COUNTDOWN,
    @AltName("SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE")
    MSG_AVATAR_REVIVE_BY_STATUE,
    @AddedIn(GI_CB2)
    @AltName("SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM")
    MSG_DAILY_TASK_REWARD_MAX_NUM,
    @AddedIn(GI_1_2_0)
    @AltName("SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN")
    MSG_ROUTINE_TYPE_NOT_OPEN,
    @AddedIn(GI_1_2_0)
    @AltName("SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM")
    MSG_ROUTINE_TYPE_REWARD_MAX_NUM,
    @AddedIn(GI_1_3_0)
    @AltName("SVR_MSG_ID_MECHANICUS_COIN_LIMIT")
    MSG_MECHANICUS_COIN_LIMIT,
}
