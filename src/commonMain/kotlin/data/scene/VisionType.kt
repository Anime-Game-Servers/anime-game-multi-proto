package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class VisionType {
    @AltName("VISION_TYPE_NONE")
    VISION_NONE,
    @AltName("VISION_TYPE_MEET")
    VISION_MEET,
    @AltName("VISION_TYPE_REBORN")
    VISION_REBORN,
    @AltName("VISION_TYPE_REPLACE")
    VISION_REPLACE,
    @AltName("VISION_TYPE_REPLACE_REBORN")
    VISION_WAYPOINT_REBORN,
    @AltName("VISION_TYPE_MISS")
    VISION_MISS,
    @AltName("VISION_TYPE_DIE")
    VISION_DIE,
    @AltName("VISION_TYPE_GATHER_ESCAPE")
    VISION_GATHER_ESCAPE,
    @AltName("VISION_TYPE_REFRESH")
    VISION_REFRESH,
    @AddedIn(VERSION.VCB2)
    @AltName("VISION_TYPE_TRANSPORT")
    VISION_TRANSPORT,
    @AddedIn(VERSION.VCB2)
    @AltName("VISION_TYPE_REPLACE_DIE")
    VISION_REPLACE_DIE,
    @AddedIn(VERSION.V1_1_0)
    @AltName("VISION_TYPE_REPLACE_NO_NOTIFY")
    VISION_REPLACE_NO_NOTIFY,
    @AddedIn(VERSION.V1_3_0)
    @AltName("VISION_TYPE_BORN")
    VISION_BORN,
    @AddedIn(VERSION.V1_2_0)
    @AltName("VISION_TYPE_PICKUP")
    VISION_PICKUP,
    @AddedIn(VERSION.V1_2_0)
    @AltName("VISION_TYPE_REMOVE")
    VISION_REMOVE,
    @AddedIn(VERSION.V1_6_0)
    @AltName("VISION_TYPE_CHANGE_COSTUME")
    VISION_CHANGE_COSTUME,
    @AddedIn(VERSION.V2_1_0)
    @AltName("VISION_TYPE_FISH_REFRESH")
    VISION_FISH_REFRESH,
    @AddedIn(VERSION.V2_1_0)
    @AltName("VISION_TYPE_FISH_BIG_SHOCK")
    VISION_FISH_BIG_SHOCK,
    @AddedIn(VERSION.V2_1_0)
    @AltName("VISION_TYPE_FISH_QTE_SUCC")
    VISION_FISH_QTE_SUCC,
    @AddedIn(VERSION.V2_3_0)
    @AltName("VISION_TYPE_CAPTURE_DISAPPEAR")
    VISION_CAPTURE_DISAPPEAR,
}