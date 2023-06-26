package data.gadget

import annotations.AddedIn
import data.general.CustomGadgetTreeInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_8_0)
@ProtoCommand(CommandType.REQUEST)
interface GadgetChangeLevelTagReq {
    var levelTagId: Int
    var combinationInfo: CustomGadgetTreeInfo
    var gadgetEntityId: Int
}