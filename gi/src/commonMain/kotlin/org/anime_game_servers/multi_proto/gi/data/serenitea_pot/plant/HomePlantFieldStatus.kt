package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.plant

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_0_0)
@ProtoEnum
internal enum class HomePlantFieldStatus {
    @AltName("HOME_PLANT_FIELD_STATUS_STATUE_NONE")
    HOME_FIELD_STATUE_NONE,
    @AltName("HOME_PLANT_FIELD_STATUS_STATUE_SEED")
    HOME_FIELD_STATUE_SEED,
    @AltName("HOME_PLANT_FIELD_STATUS_STATUE_SPROUT")
    HOME_FIELD_STATUE_SPROUT,
    @AltName("HOME_PLANT_FIELD_STATUS_STATUE_GATHER")
    HOME_FIELD_STATUE_GATHER,
}
