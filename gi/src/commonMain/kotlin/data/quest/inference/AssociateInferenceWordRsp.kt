package data.quest.inference

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_0_0)
@ProtoCommand(RESPONSE)
internal interface AssociateInferenceWordRsp {
    var associateWordId: Int
    var baseWordId: Int
    var pageId: Int
    var retCode: Int
}
