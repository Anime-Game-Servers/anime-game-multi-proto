package data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
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
    @AddedIn(Version.GI_CB2)
    var platformType: Int
    @AddedIn(Version.GI_CB2)
    var isGuest: Boolean
    @AddedIn(Version.GI_CB2)
    var cloudClientIp: Int
    @AddedIn(Version.GI_0_9_0)
    var gmUid: Int
    @AddedIn(Version.GI_0_9_0)
    var checksum: String
    @AddedIn(Version.GI_0_9_0)
    var onlineId: String
    @AddedIn(Version.GI_0_9_0)
    var clientToken: Int
    @AddedIn(Version.GI_0_9_0)
    var securityCmdReply: ByteArray
    @AddedIn(Version.GI_0_9_0)
    var extraBinData: ByteArray
    @AddedIn(Version.GI_1_0_0)
    var cps: String
    @AddedIn(Version.GI_1_0_0)
    var channelId: Int
    @AddedIn(Version.GI_1_0_0)
    var subChannelId: Int
    @AddedIn(Version.GI_1_0_0)
    var checksumClientVersion: String
    @AddedIn(Version.GI_1_0_0)
    var tag: Int
    @AddedIn(Version.GI_1_1_0)
    var trackingIoInfo: TrackingIOInfo
    @AddedIn(Version.GI_1_1_0)
    var countryCode: String
    @AddedIn(Version.GI_1_2_0)
    var clientDataVersion: Int
    @AddedIn(Version.GI_1_3_0)
    var environmentErrorCode: ByteArray
    @AddedIn(Version.GI_1_5_0)
    var targetHomeOwnerUid: Int
    @AddedIn(Version.GI_1_5_0)
    var psnId: String
    @AddedIn(Version.GI_1_5_0)
    var clientVerisonHash: String
    @AddedIn(Version.GI_2_0_0)
    var isTransfer: Boolean
    @AddedIn(Version.GI_2_0_0)
    var regPlatform: Int
    @AddedIn(Version.GI_2_0_0)
    var targetHomeParam: Int
    @AddedIn(Version.GI_2_1_0)
    var adjustTrackingInfo: AdjustTrackingInfo
    @AddedIn(Version.GI_2_3_0)
    var birthday: String
    @AddedIn(Version.GI_2_6_0)
    var securityLibraryVersion: String
    @AddedIn(Version.GI_2_6_0)
    var securityLibraryMd5: String
    @AddedIn(Version.GI_2_6_0)
    var clientPort: Int
}
