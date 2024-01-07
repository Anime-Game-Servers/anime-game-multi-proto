package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB2)
@ProtoEnum
internal enum class MpSettingType {
    @AltName("MP_SETTING_TYPE_NO_ENTER")
    MP_SETTING_NO_ENTER,
    @AltName("MP_SETTING_TYPE_ENTER_FREELY")
    MP_SETTING_ENTER_FREELY,
    @AltName("MP_SETTING_TYPE_ENTER_AFTER_APPLY")
    MP_SETTING_ENTER_AFTER_APPLY,
}