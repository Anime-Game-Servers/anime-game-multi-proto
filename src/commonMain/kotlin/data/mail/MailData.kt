package data.mail

import data.general.Item.EquipParam

interface MailData {
    var mailId: Int
    var mailTextContent: MailTextContent
    var itemList: List<EquipParam>
    var sendTime: Int
    var expireTime: Int
    var importance: Int
    var isRead: Boolean
    var isAttachmentGot: Boolean
    var configId: Int
    var argumentList: List<String>
    var collectState: MailCollectState
}