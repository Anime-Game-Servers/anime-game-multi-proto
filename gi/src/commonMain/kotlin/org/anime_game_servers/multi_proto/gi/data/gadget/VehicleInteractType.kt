package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_6_0)
@ProtoEnum
internal enum class VehicleInteractType {
    @AltName("VEHICLE_INTERACT_TYPE_NONE")
    VEHICLE_INTERACT_NONE,
    @AltName("VEHICLE_INTERACT_TYPE_IN")
    VEHICLE_INTERACT_IN,
    @AltName("VEHICLE_INTERACT_TYPE_OUT")
    VEHICLE_INTERACT_OUT,
}