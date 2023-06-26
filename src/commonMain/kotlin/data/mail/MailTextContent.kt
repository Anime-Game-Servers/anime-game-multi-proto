package data.mail

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface MailTextContent {
    var title: String
    var content: String
    var sender: String
}