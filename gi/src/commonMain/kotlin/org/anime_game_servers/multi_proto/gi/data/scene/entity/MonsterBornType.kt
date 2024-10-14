package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
internal enum class MonsterBornType {
    @AltName("MONSTER_BORN_TYPE_NONE")
    MONSTER_BORN_NONE,
    @AltName("MONSTER_BORN_TYPE_DEFAULT")
    MONSTER_BORN_DEFAULT,
    @AltName("MONSTER_BORN_TYPE_RANDOM")
    MONSTER_BORN_RANDOM,
}