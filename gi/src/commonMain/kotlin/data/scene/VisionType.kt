package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
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
    @AddedIn(Version.GI_CB2)
    @AltName("VISION_TYPE_TRANSPORT")
    VISION_TRANSPORT,
    @AddedIn(Version.GI_CB2)
    @AltName("VISION_TYPE_REPLACE_DIE")
    VISION_REPLACE_DIE,
    @AddedIn(Version.GI_1_1_0)
    @AltName("VISION_TYPE_REPLACE_NO_NOTIFY")
    VISION_REPLACE_NO_NOTIFY,
    @AddedIn(Version.GI_1_3_0)
    @AltName("VISION_TYPE_BORN")
    VISION_BORN,
    @AddedIn(Version.GI_1_2_0)
    @AltName("VISION_TYPE_PICKUP")
    VISION_PICKUP,
    @AddedIn(Version.GI_1_2_0)
    @AltName("VISION_TYPE_REMOVE")
    VISION_REMOVE,
    @AddedIn(Version.GI_1_6_0)
    @AltName("VISION_TYPE_CHANGE_COSTUME")
    VISION_CHANGE_COSTUME,
    @AddedIn(Version.GI_2_1_0)
    @AltName("VISION_TYPE_FISH_REFRESH")
    VISION_FISH_REFRESH,
    @AddedIn(Version.GI_2_1_0)
    @AltName("VISION_TYPE_FISH_BIG_SHOCK")
    VISION_FISH_BIG_SHOCK,
    @AddedIn(Version.GI_2_1_0)
    @AltName("VISION_TYPE_FISH_QTE_SUCC")
    VISION_FISH_QTE_SUCC,
    @AddedIn(Version.GI_2_3_0)
    @AltName("VISION_TYPE_CAPTURE_DISAPPEAR")
    VISION_CAPTURE_DISAPPEAR,
}