package data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface TrialAvatarGrantRecord {
    var grantReason: Int
    var fromParentQuestId: Int
}