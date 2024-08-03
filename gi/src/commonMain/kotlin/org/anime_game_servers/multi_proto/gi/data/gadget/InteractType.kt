package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
enum class InteractType {
    @AltName("INTERACT_TYPE_NONE")
    INTERACT_NONE,
    @AltName("INTERACT_TYPE_PICK_ITEM")
    INTERACT_PICK_ITEM,
    @AltName("INTERACT_TYPE_GATHER")
    INTERACT_GATHER,
    @AltName("INTERACT_TYPE_OPEN_CHEST")
    INTERACT_OPEN_CHEST,

    @AddedIn(Version.GI_CB2)
    @AltName("INTERACT_TYPE_OPEN_STATUE")
    INTERACT_OPEN_STATUE,

    @AddedIn(Version.GI_CB2)
    @AltName("INTERACT_CONSUM", "INTERACT_TYPE_CONSUME", "INTERACT_TYPE_CONSUM")
    INTERACT_CONSUME,

    @AddedIn(Version.GI_0_9_0)
    @AltName("INTERACT_TYPE_MP_PLAY_REWARD")
    INTERACT_MP_PLAY_REWARD,

    @AddedIn(Version.GI_1_0_0)
    @AltName("INTERACT_TYPE_VIEW")
    INTERACT_VIEW,

    @AddedIn(Version.GI_1_1_0)
    @AltName("INTERACT_TYPE_GENERAL_REWARD")
    INTERACT_GENERAL_REWARD,

    @AddedIn(Version.GI_1_3_0)
    @AltName("INTERACT_TYPE_MIRACLE_RING")
    INTERACT_MIRACLE_RING,

    @AddedIn(Version.GI_1_3_0)
    @AltName("INTERACT_TYPE_FONDATION")
    INTERACT_FOUNDATION,

    @AddedIn(Version.GI_1_6_0)
    @AltName("INTERACT_TYPE_ECHO_SHELL")
    INTERACT_ECHO_SHELL,

    @AddedIn(Version.GI_2_0_0)
    @AltName("INTERACT_TYPE_HOME_GATHER")
    INTERACT_HOME_GATHER,

    @AddedIn(Version.GI_2_0_0)
    @AltName("INTERACT_TYPE_ENV_ANIMAL")
    INTERACT_ENV_ANIMAL,

    @AddedIn(Version.GI_2_0_0)
    @AltName("INTERACT_TYPE_QUEST_GADGET")
    INTERACT_QUEST_GADGET,

    @AddedIn(Version.GI_2_5_0)
    @AltName("INTERACT_TYPE_UI_INTERACT")
    INTERACT_UI_INTERACT,

    @AddedIn(Version.GI_3_0_0)
    @AltName("INTERACT_TYPE_DESHRET_OBELISK")
    INTERACT_DESHRET_OBELISK,
}