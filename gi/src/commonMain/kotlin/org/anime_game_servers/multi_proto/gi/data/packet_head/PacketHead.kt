package org.anime_game_servers.multi_proto.gi.data.packet_head

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface PacketHead {
    var clientSequenceId: Int
    var enetChannelId: Int
    var enetIsReliable: Int
    var extMap: Map<Int, Int>
    var packetId: Int
    var recvTimeMs: Long
    var rpcBeginTimeMs: Int
    var rpcId: Int
    var senderAppId: Int
    var serviceAppIdMap: Map<Int, Int>
    var sourceService: Int
    var targetService: Int
    var userId: Int
    var userIp: Int
    var userSessionId: Int
    @AddedIn(GI_0_9_0)
    var gameThreadIndex: Int
    @AddedIn(GI_0_9_0)
    var isSetGameThread: Boolean
    @AddedIn(GI_0_9_0)
    var sentMs: Long
    @AddedIn(GI_1_0_0)
    var senderLoad: Int
    @AddedIn(GI_1_1_0)
    var spanContextStr: ByteArray
    @AddedIn(GI_1_5_0)
    var homeUserId: Int
    @AddedIn(GI_3_4_0)
    var isSetMultiThread: Boolean
    @AddedIn(GI_3_4_0)
    var multiThreadIndex: Int
}
