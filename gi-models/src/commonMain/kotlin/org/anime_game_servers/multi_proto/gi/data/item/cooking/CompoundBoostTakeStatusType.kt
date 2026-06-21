package org.anime_game_servers.multi_proto.gi.data.item.cooking

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_0_0)
@ProtoEnum
internal enum class CompoundBoostTakeStatusType {
    @AltName("COMPOUND_BOOST_TAKE_STATUS_TYPE_NONE")
    COMPOUND_BOOST_TAKE_STATUS_NONE,
    @AltName("COMPOUND_BOOST_TAKE_STATUS_TYPE_BOOST_ONLY")
    COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY,
    @AltName("COMPOUND_BOOST_TAKE_STATUS_TYPE_BOOST_AND_TAKE")
    COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE,
    @AltName("COMPOUND_BOOST_TAKE_STATUS_TYPE_BAG_FULL")
    COMPOUND_BOOST_TAKE_STATUS_BAG_FULL,
}
