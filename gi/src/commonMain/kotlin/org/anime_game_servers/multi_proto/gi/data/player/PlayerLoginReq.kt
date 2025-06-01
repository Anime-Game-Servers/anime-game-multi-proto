package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface PlayerLoginReq {
    var token: String
    var clientVersion: String
    var systemVersion: String
    var deviceName: String
    var deviceUuid: String
    var targetUid: Int
    var loginrand: Long
    var isEditor: Boolean
    var languageType: Int
    var accountType: Int
    var accountUid: String
    var platform: String
    var deviceInfo: String
    @AddedIn(GI_CB2)
    var platformType: Int
    @AddedIn(GI_CB2)
    var isGuest: Boolean
    @AddedIn(GI_CB2)
    var cloudClientIp: Int
    @AddedIn(GI_0_9_0)
    var gmUid: Int
    @AddedIn(GI_0_9_0)
    var checksum: String
    @AddedIn(GI_0_9_0)
    var onlineId: String
    @AddedIn(GI_0_9_0)
    var clientToken: Int
    @AddedIn(GI_0_9_0)
    var securityCmdReply: ByteArray
    @AddedIn(GI_0_9_0)
    var extraBinData: ByteArray
    @AddedIn(GI_1_0_0)
    var cps: String
    @AddedIn(GI_1_0_0)
    var channelId: Int
    @AddedIn(GI_1_0_0)
    var subChannelId: Int
    @AddedIn(GI_1_0_0)
    var checksumClientVersion: String
    @AddedIn(GI_1_0_0)
    var tag: Int
    @AddedIn(GI_1_1_0)
    var trackingIoInfo: TrackingIOInfo
    @AddedIn(GI_1_1_0)
    var countryCode: String
    @AddedIn(GI_1_2_0)
    var clientDataVersion: Int
    @AddedIn(GI_1_3_0)
    var environmentErrorCode: ByteArray
    @AddedIn(GI_1_5_0)
    var targetHomeOwnerUid: Int
    @AddedIn(GI_1_5_0)
    var psnId: String
    @AddedIn(GI_1_5_0)
    var clientVerisonHash: String
    @AddedIn(GI_2_0_0)
    var isTransfer: Boolean
    @AddedIn(GI_2_0_0)
    var regPlatform: Int
    @AddedIn(GI_2_0_0)
    var targetHomeParam: Int
    @AddedIn(GI_2_1_0)
    var adjustTrackingInfo: AdjustTrackingInfo
    @AddedIn(GI_2_3_0)
    var birthday: String
    @AddedIn(GI_2_6_0)
    var securityLibraryVersion: String
    @AddedIn(GI_2_6_0)
    var securityLibraryMd5: String
    @AddedIn(GI_2_6_0)
    var clientPort: Int
}
