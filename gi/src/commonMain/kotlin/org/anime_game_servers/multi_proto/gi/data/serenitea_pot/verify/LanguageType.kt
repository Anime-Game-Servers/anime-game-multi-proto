package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.verify

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class LanguageType {
    @AltName("LANGUAGE_TYPE_NONE")
    LANGUAGE_NONE,
    @AltName("LANGUAGE_TYPE_EN")
    LANGUAGE_EN,
    @AltName("LANGUAGE_TYPE_SC")
    LANGUAGE_SC,
    @AltName("LANGUAGE_TYPE_TC")
    LANGUAGE_TC,
    @AltName("LANGUAGE_TYPE_FR")
    LANGUAGE_FR,
    @AltName("LANGUAGE_TYPE_DE")
    LANGUAGE_DE,
    @AltName("LANGUAGE_TYPE_ES")
    LANGUAGE_ES,
    @AltName("LANGUAGE_TYPE_PT")
    LANGUAGE_PT,
    @AltName("LANGUAGE_TYPE_RU")
    LANGUAGE_RU,
    @AltName("LANGUAGE_TYPE_JP")
    LANGUAGE_JP,
    @AltName("LANGUAGE_TYPE_KR")
    LANGUAGE_KR,
    @AltName("LANGUAGE_TYPE_TH")
    LANGUAGE_TH,
    @AltName("LANGUAGE_TYPE_VN")
    LANGUAGE_VN,
    @AltName("LANGUAGE_TYPE_ID")
    LANGUAGE_ID,
    @AddedIn(GI_2_6_0)
    @AltName("LANGUAGE_TYPE_TR")
    LANGUAGE_TR,
    @AddedIn(GI_2_6_0)
    @AltName("LANGUAGE_TYPE_IT")
    LANGUAGE_IT,
}
