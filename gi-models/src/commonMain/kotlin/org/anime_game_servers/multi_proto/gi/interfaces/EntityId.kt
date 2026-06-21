package org.anime_game_servers.multi_proto.gi.interfaces

interface EntityId {
    val id: Int
    val typeId: Int
}

data class EntityIdImpl(
    override val id: Int,
    override val typeId: Int,
) : EntityId