package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
internal interface RoutePoint {
    var position: Vector
    @AddedIn(VERSION.V2_0_0)
    var arriveRange: Float
    @AddedIn(VERSION.V3_2_0)
    var hasReachEvent: Boolean

    @OneOf(
        OneOfEntry(Float::class, "velocity"),
        OneOfEntry(Float::class, "time"),
        allowTypedBasedMapping = false
    )
    var moveParams: OneOfType

    @OneOf(
        OneOfEntry(Vector::class, "rotation"),
        OneOfEntry(MathQuaternion::class, "rotation_speed"),
        OneOfEntry(MathQuaternion::class, "axis_speed"),

        allowTypedBasedMapping = false
    )
    var rotateParams: OneOfType
}