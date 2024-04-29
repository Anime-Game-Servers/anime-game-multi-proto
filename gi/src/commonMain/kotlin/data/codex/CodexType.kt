package data.codex

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_0_0)
@ProtoEnum
internal enum class CodexType {
    @AltName("CODEX_TYPE_NONE")
    CODEX_NONE,
    @AltName("CODEX_TYPE_QUEST")
    CODEX_QUEST,
    @AltName("CODEX_TYPE_WEAPON")
    CODEX_WEAPON,
    @AltName("CODEX_TYPE_ANIMAL")
    CODEX_ANIMAL,
    @AltName("CODEX_TYPE_MATERIAL")
    CODEX_MATERIAL,
    @AltName("CODEX_TYPE_BOOKS")
    CODEX_BOOKS,
    @AltName("CODEX_TYPE_PUSHTIPS")
    CODEX_PUSHTIPS,
    @AltName("CODEX_TYPE_VIEW")
    CODEX_VIEW,
    @AltName("CODEX_TYPE_RELIQUARY")
    CODEX_RELIQUARY,
}
