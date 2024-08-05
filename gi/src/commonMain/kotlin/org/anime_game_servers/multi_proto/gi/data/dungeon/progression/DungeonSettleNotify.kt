package org.anime_game_servers.multi_proto.gi.data.dungeon.progression

import org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab.ChannellerSlabLoopDungeonResultInfo
import org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge.EffigyChallengeDungeonResultInfo
import org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon.RoguelikeDungeonSettleInfo
import org.anime_game_servers.multi_proto.gi.data.tower.TowerLevelEndNotify
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.activity.crystal_link.CrystalLinkDungeonSettleInfo
import org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge_v2.EffigyChallengeV2SettleInfo
import org.anime_game_servers.multi_proto.gi.data.activity.instable_spray.InstableSprayDungeonSettleInfo
import org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2.SummerTimeV2DungeonSettleInfo
import org.anime_game_servers.multi_proto.gi.data.activity.trial.TrialAvatarFirstPassDungeonNotify
import org.anime_game_servers.multi_proto.gi.data.activity.wind_field.WindFieldDungeonSettleInfo
import org.anime_game_servers.multi_proto.gi.data.dungeon.StrengthenPointData

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface DungeonSettleNotify {
    var closeTime: Int
    var dungeonId: Int
    var failCondList: List<Int>
    var isSuccess: Boolean
    var settleShow: Map<Int, ParamList>
    @AddedIn(GI_1_1_0)
    var strengthenPointDataMap: Map<Int, StrengthenPointData>
    @AddedIn(GI_1_4_0)
    var result: Int
    @AddedIn(GI_2_0_0)
    var exhibitionInfoList: List<DungeonSettleExhibitionInfo>
    @AddedIn(GI_2_3_0)
    var useTime: Int
    @AddedIn(GI_3_1_0)
    var createPlayerUid: Int
    
    @AddedIn(GI_1_5_0)
    @OneOf(
        types = [
            OneOfEntry(ChannellerSlabLoopDungeonResultInfo::class, "channeller_slab_loop_dungeon_result_info"),
            OneOfEntry(EffigyChallengeDungeonResultInfo::class, "effigy_challenge_dungeon_result_info"),
            OneOfEntry(TowerLevelEndNotify::class, "tower_level_end_notify"),
            OneOfEntry(TrialAvatarFirstPassDungeonNotify::class, "trial_avatar_first_pass_dungeon_notify"),
            OneOfEntry(RoguelikeDungeonSettleInfo::class, "roguelike_dungeon_settle_info", addedIn = GI_2_2_0),
            OneOfEntry(CrystalLinkDungeonSettleInfo::class, "crystal_link_settle_info", addedIn = GI_2_6_0),
            OneOfEntry(SummerTimeV2DungeonSettleInfo::class, "summer_time_v2_dungeon_settle_info", addedIn = GI_2_8_0),
            OneOfEntry(InstableSprayDungeonSettleInfo::class, "instable_spray_settle_info", addedIn = GI_3_0_0),
            OneOfEntry(WindFieldDungeonSettleInfo::class, "wind_field_dungeon_settle_info", addedIn = GI_3_1_0),
            OneOfEntry(EffigyChallengeV2SettleInfo::class, "effigy_challenge_v2_settle_info", addedIn = GI_3_2_0),
        ]
    )
    var detail: OneOfType
}
