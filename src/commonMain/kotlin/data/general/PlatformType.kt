package data.general

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoEnum

import messages.VERSION.VCB2
import messages.VERSION.V1_5_0
import messages.VERSION.V2_0_0
import messages.VERSION.V2_4_0
import messages.VERSION.V2_8_0
import org.anime_game_servers.annotations.AltName

@AddedIn(VCB2)
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
    @AddedIn(V1_5_0)
    @AltName("PLATFORM_TYPE_PS5")
    PS5,
    @AddedIn(V2_0_0)
    @AltName("PLATFORM_TYPE_CLOUD_WEB")
    CLOUD_WEB,
    @AddedIn(V2_0_0)
    @AltName("PLATFORM_TYPE_CLOUD_TV")
    CLOUD_TV,
    @AddedIn(V2_4_0)
    @AltName("PLATFORM_TYPE_CLOUD_MAC")
    CLOUD_MAC,
    @AddedIn(V2_4_0)
    @AltName("PLATFORM_TYPE_CLOUD_PC")
    CLOUD_PC,
    @AddedIn(V2_8_0)
    @AltName("PLATFORM_TYPE_CLOUD_THIRD_PARTY_MOBILE")
    CLOUD_THIRD_PARTY_MOBILE,
    @AddedIn(V2_8_0)
    @AltName("PLATFORM_TYPE_CLOUD_THIRD_PARTY_PC")
    CLOUD_THIRD_PARTY_PC,
}