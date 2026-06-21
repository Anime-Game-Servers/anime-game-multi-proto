package org.anime_game_servers.multi_proto.gi.converters

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.annotations.Converter
import org.anime_game_servers.multi_proto.core.annotations.TypeConverter
import org.anime_game_servers.multi_proto.gi.data.administration.pathfinding.GMObstacleShapeType
import org.anime_game_servers.multi_proto.gi.data.pathfinding.ObstacleShapeType
import org.anime_game_servers.multi_proto.gi.interfaces.EntityId
import org.anime_game_servers.multi_proto.gi.interfaces.EntityIdImpl

//import org.anime_game_servers.multi_proto.gi.utils.VersionUtils

@Converter(Int::class, EntityId::class)
object IntToEntityIdConverter : TypeConverter<Int, EntityId> {
    override fun inToOut(inData: Int, version: Version) = EntityIdImpl(0,0)//VersionUtils.entityIdConverter(inData, version)

    override fun outToIn(outData : EntityId, version: Version) = 0//VersionUtils.toProtoEntityId(outData.id, outData.typeId, version)
}
