package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.avatar.AvatarInfo

@AddedIn(GI_CB2)
@ProtoModel
internal interface DungeonCandidateTeamAvatar {
    var avatarInfo: AvatarInfo
    var playerUid: Int
}
