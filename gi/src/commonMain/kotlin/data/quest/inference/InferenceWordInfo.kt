package data.quest.inference

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel(alternativeNames = ["InfernceWordInfo"])
internal interface InferenceWordInfo {
    var isAssociate: Boolean
    var isInterpret: Boolean
    var isSubmit: Boolean
    var unlockByWordId: Int
    var wordId: Int
}
