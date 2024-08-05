package org.anime_game_servers.multi_proto.gi.data.scene.group_link

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.scene.group_link.GroupLinkBundle

@AddedIn(GI_2_4_0)
@ProtoCommand(NOTIFY)
internal interface GroupLinkMarkUpdateNotify {
    var bundle: GroupLinkBundle
}