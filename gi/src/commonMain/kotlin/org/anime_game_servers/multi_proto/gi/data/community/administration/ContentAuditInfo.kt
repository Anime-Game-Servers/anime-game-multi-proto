package org.anime_game_servers.multi_proto.gi.data.community.administration

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface ContentAuditInfo {
    var auditState: AuditState
    var content: String
    var isOpen: Boolean
    var submitCount: Int
    var submitLimit: Int
}
