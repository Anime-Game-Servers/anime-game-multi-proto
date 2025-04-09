package org.anime_game_servers.multi_proto.gi.data.item.widget.firework

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_4_0)
@ProtoEnum
internal enum class FireworksLaunchParamType {
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_NONE")
    FIREWORKS_LAUNCH_PARAM_NONE,
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT")
    FIREWORKS_LAUNCH_PARAM_REPEAT,
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL")
    FIREWORKS_LAUNCH_PARAM_INTEVAL,
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_DELAY")
    FIREWORKS_LAUNCH_PARAM_DELAY,
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL", "FIREWORKS_LAUNCH_PARAM_ROUND_INTEVAL")
    FIREWORKS_LAUNCH_PARAM_ROUND_INTERVAL,
    @AltName("FIREWORKS_LAUNCH_PARAM_TYPE_MAX")
    FIREWORKS_LAUNCH_PARAM_MAX,
}
