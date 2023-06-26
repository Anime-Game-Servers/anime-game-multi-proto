package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_6_0)
@ProtoEnum
enum class VehicleInteractType {
    VEHICLE_INTERACT_NONE,
    VEHICLE_INTERACT_IN,
    VEHICLE_INTERACT_OUT,
}