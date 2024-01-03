package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface WorktopInfo {
    var optionList: List<Int>
    @AddedIn(VERSION.VCB2)
    var isGuestCanOperate: Boolean
}
