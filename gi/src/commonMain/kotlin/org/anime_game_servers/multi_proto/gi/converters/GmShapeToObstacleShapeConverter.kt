package org.anime_game_servers.multi_proto.gi.converters

import org.anime_game_servers.multi_proto.core.annotations.Converter
import org.anime_game_servers.multi_proto.core.annotations.TypeConverter
import org.anime_game_servers.multi_proto.gi.data.administration.pathfinding.GMObstacleShapeType
import org.anime_game_servers.multi_proto.gi.messages.administration.pathfinding.GMObstacleShapeType as GMObstacleShapeTypeImpl
import org.anime_game_servers.multi_proto.gi.messages.pathfinding.ObstacleShapeType as ShapeTypeImpl
import org.anime_game_servers.multi_proto.gi.data.pathfinding.ObstacleShapeType

@Converter(GMObstacleShapeType::class, ObstacleShapeType::class)
object GmShapeToObstacleShapeConverter : TypeConverter<GMObstacleShapeTypeImpl, ShapeTypeImpl> {
    override fun inToOut(inData: GMObstacleShapeTypeImpl): ShapeTypeImpl = when(inData){
        GMObstacleShapeTypeImpl.SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE -> ShapeTypeImpl.OBSTACLE_SHAPE_CAPSULE
        GMObstacleShapeTypeImpl.SHAPE_TYPE_OBSTACLE_SHAPE_BOX -> ShapeTypeImpl.OBSTACLE_SHAPE_BOX
        GMObstacleShapeTypeImpl.UNRECOGNISED -> ShapeTypeImpl.UNRECOGNISED
    }
    override fun outToIn(outData: ShapeTypeImpl): GMObstacleShapeTypeImpl = when(outData){
        ShapeTypeImpl.OBSTACLE_SHAPE_CAPSULE -> GMObstacleShapeTypeImpl.SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE
        ShapeTypeImpl.OBSTACLE_SHAPE_BOX -> GMObstacleShapeTypeImpl.SHAPE_TYPE_OBSTACLE_SHAPE_BOX
        ShapeTypeImpl.UNRECOGNISED -> GMObstacleShapeTypeImpl.UNRECOGNISED
    }
}
