package data.item

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.entity.SceneReliquaryInfo
import data.general.entity.SceneWeaponInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarEquipChangeNotify {
    var avatarGuid: Long
    var equipType: Int
    var itemId: Int
    var equipGuid: Long
    var weapon: SceneWeaponInfo
    var reliquary: SceneReliquaryInfo
}
