package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface MailTextContent {
    var title: String
    var content: String
    var sender: String
}