package org.anime_game_servers.multi_proto.gi.data.gallery.draft

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
internal interface DraftGuestReplyInviteRsp {
    var draftId: Int
    var isAgree: Boolean
    var retcode: Int
}