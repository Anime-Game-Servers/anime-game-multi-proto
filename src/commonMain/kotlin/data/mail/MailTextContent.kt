package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB1)
@ProtoModel
interface MailTextContent {
    var title: String
    var content: String
    var sender: String
}