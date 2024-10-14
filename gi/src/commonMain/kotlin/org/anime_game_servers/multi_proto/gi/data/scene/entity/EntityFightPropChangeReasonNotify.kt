package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.PropChangeReason

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface EntityFightPropChangeReasonNotify {
    var entityId: Int
    var paramList: List<Int>
    var propDelta: Float
    var propType: Int
    var reason: PropChangeReason
    @AddedIn(GI_1_2_0)
    var changeHpReason: ChangeHpReason
    @AddedIn(GI_2_1_0)
    @AltName("changeEnergyReson")
    var changeEnergyReason: ChangeEnergyReason
}
