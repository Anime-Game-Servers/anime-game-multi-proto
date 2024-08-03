package data.team.avatar.friendship

import data.general.avatar.AvatarFetterInfo
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface AvatarFetterDataNotify {
    var fetterInfoMap: Map<Long, AvatarFetterInfo>
}
