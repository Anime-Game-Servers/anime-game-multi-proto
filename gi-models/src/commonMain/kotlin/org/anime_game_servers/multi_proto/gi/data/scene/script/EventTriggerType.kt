package org.anime_game_servers.multi_proto.gi.data.scene.script

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class EventTriggerType {
    @AltName("EVENT_TRIGGER_TYPE_NONE")
    EVENT_TRIGGER_NONE,
    @AltName("EVENT_TRIGGER_TYPE_ENTER_FORCE")
    EVENT_TRIGGER_ENTER_FORCE,
}
