package data.general.avatar

import annotations.AddedIn
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface TrialAvatarInfo {
    var trialAvatarId: Int
    var trialEquipList: List<Item>
    @AddedIn(VERSION.VCB2)
    var grantRecord: TrialAvatarGrantRecord
}