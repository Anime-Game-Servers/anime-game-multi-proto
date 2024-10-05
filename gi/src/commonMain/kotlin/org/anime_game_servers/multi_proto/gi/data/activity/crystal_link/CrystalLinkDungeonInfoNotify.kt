package org.anime_game_servers.multi_proto.gi.data.activity.crystal_link

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_6_0)
@ProtoCommand(NOTIFY)
internal interface CrystalLinkDungeonInfoNotify {
    var buffInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.crystal_link.CrystalLinkBuffInfo>
    var difficultyId: Int
    var dungeonAvatarInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.crystal_link.CrystalLinkDungeonAvatarInfo>
    var initGalleryProgress: Int
    var isUpperPart: Boolean
    var levelId: Int
}
