package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.comp_info

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.community.friends.FriendEnterHomeOption

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface PlayerHomeCompInfo {
    var friendEnterHomeOption: FriendEnterHomeOption
    @AltName("levelupRewardGotLevelList")
    var levelUpRewardGotLevelList: List<Int>
    var unlockedModuleIdList: List<Int>
    @AddedIn(GI_2_2_0)
    var seenModuleIdList: List<Int>
}
