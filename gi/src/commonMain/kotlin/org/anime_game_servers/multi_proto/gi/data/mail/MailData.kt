package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface MailData {
    var mailId: Int

    @RemovedIn(Version.GI_CB2)
    var index: Int

    @RemovedIn(Version.GI_CB2)
    var textId: Int
    var mailTextContent: MailTextContent
    var itemList: List<MailItem>// before 0.9 it was EquipParam TODO handle this
    var sendTime: Int
    var expireTime: Int
    var importance: Int
    var isRead: Boolean
    var isAttachmentGot: Boolean

    @AddedIn(Version.GI_0_9_0)
    var configId: Int

    @AddedIn(Version.GI_0_9_0)
    var argumentList: List<String>

    @AddedIn(Version.GI_2_4_0)
    var collectState: MailCollectState
}