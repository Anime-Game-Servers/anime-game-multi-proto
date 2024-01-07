package data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
@ProtoModel
internal interface RoutePoint {
    var position: Vector
    @AddedIn(Version.GI_2_0_0)
    var arriveRange: Float
    @AddedIn(Version.GI_3_2_0)
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