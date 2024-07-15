package data.quest.bargain

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class BargainResultType {
    @AltName("BARGAIN_RESULT_TYPE_COMPLETE_SUCC")
    BARGAIN_COMPLETE_SUCC,
    @AltName("BARGAIN_RESULT_TYPE_SINGLE_FAIL")
    BARGAIN_SINGLE_FAIL,
    @AltName("BARGAIN_RESULT_TYPE_COMPLETE_FAIL")
    BARGAIN_COMPLETE_FAIL,
}
