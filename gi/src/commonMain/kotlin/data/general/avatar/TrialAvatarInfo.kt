package data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface TrialAvatarInfo {
    var trialAvatarId: Int
    var trialEquipList: List<Item>
    @AddedIn(Version.GI_CB2)
    var grantRecord: TrialAvatarGrantRecord
}