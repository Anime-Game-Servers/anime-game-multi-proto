package data.scene

import annotations.AddedIn
import data.scene.entity.MPLevelEntityInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.VCB1
import messages.VERSION.VCB2
import messages.VERSION.V1_0_0

@AddedIn(VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerEnterSceneInfoNotify {
    var curAvatarEntityId : Int
    var avatarEnterInfo : List<AvatarEnterSceneInfo>
    var teamEnterInfo : TeamEnterSceneInfo
    @AddedIn(VCB2)
    var mpLevelEntityInfo : MPLevelEntityInfo
    @AddedIn(V1_0_0)
    var enterSceneToken : Int
}