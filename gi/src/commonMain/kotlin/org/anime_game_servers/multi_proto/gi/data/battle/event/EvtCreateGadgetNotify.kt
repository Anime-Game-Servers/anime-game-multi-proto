package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface EvtCreateGadgetNotify {
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    var entityId: Int
    var configId: Int
    var campId: Int
    var campType: Int
    var initPos: Vector
    var initEulerAngles: Vector
    var guid: Long
    var ownerEntityId: Int
    var targetEntityId: Int
    var isAsyncLoad: Boolean
    var targetLockPointIndex: Int
    @AddedIn(Version.GI_CB2)
    var roomId: Int
    @AddedIn(Version.GI_1_0_0)
    var propOwnerEntityId: Int
    @AddedIn(Version.GI_1_2_0)
    var sightGroupWithOwner: Boolean
    @AddedIn(Version.GI_2_4_0)
    var isPeerIdFromPlayer: Boolean
    @AddedIn(Version.GI_2_6_0)
    var isTrueLifeTimeByOwner: Boolean
    @AddedIn(Version.GI_2_7_0)
    var targetEntityIdList: List<Int>
    @AddedIn(Version.GI_2_7_0)
    var targetLockPointIndexList: List<Int>
}
