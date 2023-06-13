package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
enum class InteractType {
    INTERACT_NONE,
    INTERACT_PICK_ITEM,
    INTERACT_GATHER,
    INTERACT_OPEN_CHEST,
    @AddedIn(VERSION.VCB2)
    INTERACT_OPEN_STATUE,
    @AddedIn(VERSION.VCB2)
    INTERACT_CONSUM,
    @AddedIn(VERSION.V0_9_0)
    INTERACT_MP_PLAY_REWARD,
    @AddedIn(VERSION.V1_0_0)
    INTERACT_VIEW,
    @AddedIn(VERSION.V1_1_0)
    INTERACT_GENERAL_REWARD,
}