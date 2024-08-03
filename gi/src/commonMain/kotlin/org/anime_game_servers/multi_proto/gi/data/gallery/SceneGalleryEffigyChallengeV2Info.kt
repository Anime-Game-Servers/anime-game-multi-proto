package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_2_0)
@ProtoModel
internal interface SceneGalleryEffigyChallengeV2Info {
    @AltName("killed_monster_cnt")
    var killedMonsterCount: Int
    @AltName("total_target_kill_cnt")
    var totalTargetKillCount: Int
    var sceneStartTime: Int
    var tRemainUseTime: Int
    var bossViolentLevel: Int
}