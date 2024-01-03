package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_6_0)
@ProtoEnum
enum class VehicleInteractType {
    @AltName("VEHICLE_INTERACT_TYPE_NONE")
    VEHICLE_INTERACT_NONE,
    @AltName("VEHICLE_INTERACT_TYPE_IN")
    VEHICLE_INTERACT_IN,
    @AltName("VEHICLE_INTERACT_TYPE_OUT")
    VEHICLE_INTERACT_OUT,
}