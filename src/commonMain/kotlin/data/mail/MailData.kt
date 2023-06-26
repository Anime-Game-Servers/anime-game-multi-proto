package data.mail

import annotations.AddedIn
import annotations.RemovedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB1)
@ProtoModel
interface MailData {
    var mailId: Int

    @RemovedIn(messages.VERSION.VCB2)
    var index: Int

    @RemovedIn(messages.VERSION.VCB2)
    var textId: Int
    var mailTextContent: MailTextContent
    var itemList: List<MailItem>// before 0.9 it was EquipParam TODO handle this
    var sendTime: Int
    var expireTime: Int
    var importance: Int
    var isRead: Boolean
    var isAttachmentGot: Boolean

    @AddedIn(messages.VERSION.V0_9_0)
    var configId: Int

    @AddedIn(messages.VERSION.V0_9_0)
    var argumentList: List<String>

    @AddedIn(messages.VERSION.V2_4_0)
    var collectState: MailCollectState
}