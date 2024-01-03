package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
interface PlayerLoginReq {
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
    @AddedIn(VERSION.VCB2)
    var platformType: Int
    @AddedIn(VERSION.VCB2)
    var isGuest: Boolean
    @AddedIn(VERSION.VCB2)
    var cloudClientIp: Int
    @AddedIn(VERSION.V0_9_0)
    var gmUid: Int
    @AddedIn(VERSION.V0_9_0)
    var checksum: String
    @AddedIn(VERSION.V0_9_0)
    var onlineId: String
    @AddedIn(VERSION.V0_9_0)
    var clientToken: Int
    @AddedIn(VERSION.V0_9_0)
    var securityCmdReply: ByteArray
    @AddedIn(VERSION.V0_9_0)
    var extraBinData: ByteArray
    @AddedIn(VERSION.V1_0_0)
    var cps: String
    @AddedIn(VERSION.V1_0_0)
    var channelId: Int
    @AddedIn(VERSION.V1_0_0)
    var subChannelId: Int
    @AddedIn(VERSION.V1_0_0)
    var checksumClientVersion: String
    @AddedIn(VERSION.V1_0_0)
    var tag: Int
    @AddedIn(VERSION.V1_1_0)
    var trackingIoInfo: TrackingIOInfo
    @AddedIn(VERSION.V1_1_0)
    var countryCode: String
    @AddedIn(VERSION.V1_2_0)
    var clientDataVersion: Int
    @AddedIn(VERSION.V1_3_0)
    var environmentErrorCode: ByteArray
    @AddedIn(VERSION.V1_5_0)
    var targetHomeOwnerUid: Int
    @AddedIn(VERSION.V1_5_0)
    var psnId: String
    @AddedIn(VERSION.V1_5_0)
    var clientVerisonHash: String
    @AddedIn(VERSION.V2_0_0)
    var isTransfer: Boolean
    @AddedIn(VERSION.V2_0_0)
    var regPlatform: Int
    @AddedIn(VERSION.V2_0_0)
    var targetHomeParam: Int
    @AddedIn(VERSION.V2_1_0)
    var adjustTrackingInfo: AdjustTrackingInfo
    @AddedIn(VERSION.V2_3_0)
    var birthday: String
    @AddedIn(VERSION.V2_6_0)
    var securityLibraryVersion: String
    @AddedIn(VERSION.V2_6_0)
    var securityLibraryMd5: String
    @AddedIn(VERSION.V2_6_0)
    var clientPort: Int
}
