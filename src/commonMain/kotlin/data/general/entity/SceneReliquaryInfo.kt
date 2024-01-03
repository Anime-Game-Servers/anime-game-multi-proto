package data.general.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface SceneReliquaryInfo {
    var itemId: Int
    var guid: Long
    var level: Int
    var promoteLevel: Int
}