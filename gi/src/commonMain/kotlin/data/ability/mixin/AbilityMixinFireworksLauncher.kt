package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface AbilityMixinFireworksLauncher {
    var firedBulletCount: Int
    var fireworksConfig: List<Int>
    var invokeType: Int
    var phase: Int
    var startCountDownTime: Int
    var turnIndex: Int
}
