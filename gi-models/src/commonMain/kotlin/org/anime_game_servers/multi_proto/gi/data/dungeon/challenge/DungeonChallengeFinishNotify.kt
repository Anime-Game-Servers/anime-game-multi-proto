package org.anime_game_servers.multi_proto.gi.data.dungeon.challenge

import org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab.ChannelerSlabLoopDungeonResultInfo
import org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge.EffigyChallengeDungeonResultInfo
import org.anime_game_servers.multi_proto.gi.data.activity.potion.PotionDungeonResultInfo
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.dungeon.StrengthenPointData

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface DungeonChallengeFinishNotify {
    var challengeIndex: Int
    var isSuccess: Boolean
    @AddedIn(GI_CB2)
    var challengeRecordType: Int
    @AddedIn(GI_CB2)
    var currentValue: Int
    @AddedIn(GI_CB2)
    var isNewRecord: Boolean
    @AddedIn(GI_1_1_0)
    var strengthenPointDataMap: Map<Int, StrengthenPointData>
    @AddedIn(GI_2_3_0)
    var finishType: ChallengeFinishType
    @AddedIn(GI_2_5_0)
    var timeCost: Int
    
    @AddedIn(GI_1_5_0)
    @OneOf(
        types = [
            OneOfEntry(ChannelerSlabLoopDungeonResultInfo::class, "channeller_slab_loop_dungeon_result_info"),
            OneOfEntry(EffigyChallengeDungeonResultInfo::class, "effigy_challenge_dungeon_result_info", addedIn = GI_1_6_0),
            OneOfEntry(PotionDungeonResultInfo::class, "potion_dungeon_result_info", addedIn = GI_2_4_0),
            OneOfEntry(CustomDungeonResultInfo::class, "custom_dungeon_result_info", addedIn = GI_2_5_0),
        ]
    )
    var detail: OneOfType
}
