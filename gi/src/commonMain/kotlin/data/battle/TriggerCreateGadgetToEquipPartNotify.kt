package data.battle

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface TriggerCreateGadgetToEquipPartNotify {
    var entityId: Int
    var equipPart: String
    var gadgetEntityId: Int
    var gadgetId: Int
}
