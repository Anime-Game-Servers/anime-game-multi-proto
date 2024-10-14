package org.anime_game_servers.multi_proto.gi.data.activity.mist_trial

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.AvatarType

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface MistTrialBestAvatar {
    var avatarId: Int
    var avatarType: AvatarType
    var costumeId: Int
}
