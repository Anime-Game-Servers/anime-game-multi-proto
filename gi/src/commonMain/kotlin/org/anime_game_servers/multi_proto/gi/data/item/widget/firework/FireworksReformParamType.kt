package org.anime_game_servers.multi_proto.gi.data.item.widget.firework

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_4_0)
@ProtoEnum
internal enum class FireworksReformParamType {
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_NONE")
    FIREWORKS_REFORM_PARAM_NONE,
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_COLOR")
    FIREWORKS_REFORM_PARAM_COLOR,
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_HEIGHT")
    FIREWORKS_REFORM_PARAM_HEIGHT,
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_SIZE")
    FIREWORKS_REFORM_PARAM_SIZE,
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_DENSITY")
    FIREWORKS_REFORM_PARAM_DENSITY,
    @AltName("FIREWORKS_REFORM_PARAM_TYPE_ROTATION")
    FIREWORKS_REFORM_PARAM_ROTATION,
}
