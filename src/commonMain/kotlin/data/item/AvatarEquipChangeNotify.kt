package data.item

import annotations.AddedIn
import data.general.entity.SceneReliquaryInfo
import data.general.entity.SceneWeaponInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarEquipChangeNotify {
    var avatarGuid: Long
    var equipType: Int
    var itemId: Int
    var equipGuid: Long
    var weapon: SceneWeaponInfo
    var reliquary: SceneReliquaryInfo
}
