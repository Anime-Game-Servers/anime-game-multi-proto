package data.activity.trial

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.REQUEST)
interface ReceivedTrialAvatarActivityRewardReq {
    var trialAvatarIndexId: Int
}