package org.anime_game_servers.multi_proto.gi.data.activity.potion

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_4_0)
@ProtoCommand(REQUEST)
internal interface PotionEnterDungeonReq {
    var avatarInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.potion.PotionAvatarInfo>
    var buffIdList: List<Int>
    var levelId: Int
    var modeId: Int
    var stageId: Int
}
