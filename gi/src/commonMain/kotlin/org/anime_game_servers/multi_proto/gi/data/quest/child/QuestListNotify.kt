package org.anime_game_servers.multi_proto.gi.data.quest.child

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface QuestListNotify {
    var questList: List<org.anime_game_servers.multi_proto.gi.data.quest.child.Quest>
}
