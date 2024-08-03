package org.anime_game_servers.multi_proto.gi.data.ability.meta

import org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfoPair
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface AbilityMetaSetPoseParameter {
    var value: org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfoPair
}
