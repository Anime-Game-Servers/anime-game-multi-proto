package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface RogueDiaryAvatar {
    var avatar: org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary.ActivityDungeonAvatar
    var disableStatusList: List<org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary.RogueDiaryAvatarDisableStatus>
    var level: Int
    var tiredRound: Int
}
