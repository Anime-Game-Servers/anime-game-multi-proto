package org.anime_game_servers.multi_proto.gi.data.team.avatar.properties

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.PropChangeReason

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface AvatarPropChangeReasonNotify {
    var avatarGuid: Long
    var curValue: Float
    var oldValue: Float
    var propType: Int
    var reason: PropChangeReason
}
