package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.CustomGadgetTreeInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_2_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetCustomTreeInfoNotify {
    var gadgetEntityId: Int
    var customGadgetTreeInfo: CustomGadgetTreeInfo
}