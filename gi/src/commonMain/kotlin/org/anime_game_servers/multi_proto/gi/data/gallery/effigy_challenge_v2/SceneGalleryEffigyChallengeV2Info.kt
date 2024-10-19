package org.anime_game_servers.multi_proto.gi.data.gallery.effigy_challenge_v2

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface SceneGalleryEffigyChallengeV2Info {
    var bossViolentLevel: Int
    @AltName("killed_monster_cnt")
    var killedMonsterCount: Int
    var sceneStartTime: Int
    var tRemainUseTime: Int
    @AltName("total_target_kill_cnt")
    var totalTargetKillCount: Int
}