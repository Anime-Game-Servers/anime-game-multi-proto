package data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.AltName

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class PlatformType {
    @AltName("PLATFORM_TYPE_EDITOR")
    EDITOR,
    @AltName("PLATFORM_TYPE_IOS")
    IOS,
    @AltName("PLATFORM_TYPE_ANDROID")
    ANDROID,
    @AltName("PLATFORM_TYPE_PC")
    PC,
    @AltName("PLATFORM_TYPE_PS4")
    PS4,
    @AltName("PLATFORM_TYPE_")
    SERVER,
    @AltName("PLATFORM_TYPE_CLOUD_ANDROID")
    CLOUD_ANDROID,
    @AltName("PLATFORM_TYPE_CLOUD_IOS")
    CLOUD_IOS,
    @AddedIn(GI_1_5_0)
    @AltName("PLATFORM_TYPE_PS5")
    PS5,
    @AddedIn(GI_2_0_0)
    @AltName("PLATFORM_TYPE_CLOUD_WEB")
    CLOUD_WEB,
    @AddedIn(GI_2_0_0)
    @AltName("PLATFORM_TYPE_CLOUD_TV")
    CLOUD_TV,
    @AddedIn(GI_2_4_0)
    @AltName("PLATFORM_TYPE_CLOUD_MAC")
    CLOUD_MAC,
    @AddedIn(GI_2_4_0)
    @AltName("PLATFORM_TYPE_CLOUD_PC")
    CLOUD_PC,
    @AddedIn(GI_2_8_0)
    @AltName("PLATFORM_TYPE_CLOUD_THIRD_PARTY_MOBILE")
    CLOUD_THIRD_PARTY_MOBILE,
    @AddedIn(GI_2_8_0)
    @AltName("PLATFORM_TYPE_CLOUD_THIRD_PARTY_PC")
    CLOUD_THIRD_PARTY_PC,
}