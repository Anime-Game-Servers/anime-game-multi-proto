package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB2)
@ProtoEnum
internal enum class MpSettingType {
    @AltName("MP_SETTING_TYPE_NO_ENTER")
    MP_SETTING_NO_ENTER,
    @AltName("MP_SETTING_TYPE_ENTER_FREELY")
    MP_SETTING_ENTER_FREELY,
    @AltName("MP_SETTING_TYPE_ENTER_AFTER_APPLY")
    MP_SETTING_ENTER_AFTER_APPLY,
}