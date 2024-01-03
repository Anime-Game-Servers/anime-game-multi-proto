package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class MonsterBornType {
    @AltName("MONSTER_BORN_TYPE_NONE")
    MONSTER_BORN_NONE,
    @AltName("MONSTER_BORN_TYPE_DEFAULT")
    MONSTER_BORN_DEFAULT,
    @AltName("MONSTER_BORN_TYPE_RANDOM")
    MONSTER_BORN_RANDOM,
}