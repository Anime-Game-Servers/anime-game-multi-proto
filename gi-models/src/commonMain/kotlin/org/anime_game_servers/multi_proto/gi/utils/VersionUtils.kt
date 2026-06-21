package org.anime_game_servers.multi_proto.gi.utils

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.gi.interfaces.EntityId
import org.anime_game_servers.multi_proto.gi.interfaces.EntityIdImpl
import kotlin.jvm.JvmStatic

object VersionUtils {
    @JvmStatic
    fun toProtoEntityId(entityId: Int, entityTypeId: Int, version: Version) : Int{
        val shift = getEntityIdBitshift(version)
        return (entityTypeId shl shift) + entityId
    }
    @JvmStatic
    fun fromProtoEntityId(entityId: Int, version: Version) : Pair<Int,Int>{
        val shift = getEntityIdBitshift(version)
        val type = entityId shr shift
        val id = entityId - (type shl shift)
        return id to type
    }

    @JvmStatic
    fun getEntityIdBitshift(version: Version) = when {
        version.id > Version.GI_6_4_0.id -> 21 // newer 6.4, starting with release 6.5
        version.id in Version.GI_6_1_0.id .. Version.GI_6_4_0.id -> 22 // 6.1 to
        else -> 24 // cb to 6.0
    }

    @JvmStatic
    fun defaultProtoEidToEid(protoEid: Int, version: Version): EntityId {
        val (id, typeId) = fromProtoEntityId(protoEid, version)
        return EntityIdImpl(id, typeId)
    }

    var entityIdConverter: ((Int, Version) -> EntityId) = ::defaultProtoEidToEid
}