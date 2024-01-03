package data.general.avatar

import annotations.AddedIn
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface TrialAvatarGrantRecord {
    var grantReason: Int
    var fromParentQuestId: Int
}