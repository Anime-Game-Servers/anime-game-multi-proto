package org.anime_game_servers.multi_proto.gi.data.gallery.draft

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_4_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum
internal enum class DraftInviteFailReason {
    @AltName("DRAFT_INVITE_FAIL_REASON_UNKNOWN")
    DRAFT_FAIL_UNKNOWN,
    @AltName("DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN")
    DRAFT_ACTIVITY_NOT_OPEN,
    @AltName("DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN")
    DRAFT_ACTIVITY_PLAY_NOT_OPEN,
    @AltName("DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET")
    DRAFT_SCENE_NOT_MEET,
    @AltName("DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET")
    DRAFT_WORLD_NOT_MEET,
    @AltName("DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET")
    DRAFT_PLAY_LIMIT_NOT_MEET,
    @AddedIn(GI_4_0_0) // TODO check 3.8.0
    @AltName("DRAFT_INVITE_FAIL_REASON_ACTIVITY_CONFIG_NOT_FOUND,")
    DRAFT_ACTIVITY_CONFIG_NOT_FOUND,
}
