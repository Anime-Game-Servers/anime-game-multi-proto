package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface MailData {
    var expireTime: Int
    var importance: Int
    var isRead: Boolean
    var isAttachmentGot: Boolean
    var itemList: List<MailItem>// before 0.9 it was EquipParam TODO handle this
    var mailId: Int
    var mailTextContent: MailTextContent
    var sendTime: Int

    @RemovedIn(GI_CB2)
    var index: Int
    @RemovedIn(GI_CB2)
    var textId: Int

    @AddedIn(GI_0_9_0)
    var configId: Int
    @AddedIn(GI_0_9_0)
    var argumentList: List<String>

    @AddedIn(GI_2_4_0)
    var collectState: MailCollectState
}
