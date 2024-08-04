package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.CustomGadgetTreeInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_8_0)
@ProtoCommand(CommandType.REQUEST)
interface GadgetChangeLevelTagReq {
    var levelTagId: Int
    var combinationInfo: CustomGadgetTreeInfo
    var gadgetEntityId: Int
}