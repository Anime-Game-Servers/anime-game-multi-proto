package data.battle.event

import data.battle.ForwardType
import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtAvatarEnterFocusNotify {
    var canMove: Boolean
    var enterHoldingFocusShoot: Boolean
    var enterNormalFocusShoot: Boolean
    var entityId: Int
    var fastFocus: Boolean
    var focusForward: Vector
    var forwardType: ForwardType
    var showCrossHair: Boolean
    var useAutoFocus: Boolean
    var useFocusSticky: Boolean
    var useGyro: Boolean
    @AddedIn(GI_1_4_0)
    var disableAnim: Boolean
    @AddedIn(GI_2_3_0)
    var disableAimLayer: Boolean
}
