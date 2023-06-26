package data.gadget

import annotations.AddedIn
import data.general.CustomGadgetTreeInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_2_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetCustomTreeInfoNotify {
    var gadgetEntityId: Int
    var customGadgetTreeInfo: CustomGadgetTreeInfo
}