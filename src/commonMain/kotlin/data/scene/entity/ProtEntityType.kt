package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class ProtEntityType {
    @AltName("PROT_ENTITY_TYPE_NONE")
    PROT_ENTITY_NONE,
    @AltName("PROT_ENTITY_TYPE_AVATAR")
    PROT_ENTITY_AVATAR,
    @AltName("PROT_ENTITY_TYPE_MONSTER")
    PROT_ENTITY_MONSTER,
    @AltName("PROT_ENTITY_TYPE_NPC")
    PROT_ENTITY_NPC,
    @AltName("PROT_ENTITY_TYPE_GADGET")
    PROT_ENTITY_GADGET,
    @AltName("PROT_ENTITY_TYPE_REGION")
    PROT_ENTITY_REGION,
    @AltName("PROT_ENTITY_TYPE_WEAPON")
    PROT_ENTITY_WEAPON,
    @AltName("PROT_ENTITY_TYPE_WEATHER")
    PROT_ENTITY_WEATHER,
    @AltName("PROT_ENTITY_TYPE_SCENE")
    PROT_ENTITY_SCENE,
    @AltName("PROT_ENTITY_TYPE_TEAM")
    PROT_ENTITY_TEAM,
    @AltName("PROT_ENTITY_TYPE_MASSIVE_ENTITY")
    PROT_ENTITY_MASSIVE_ENTITY,
    @AddedIn(VERSION.V0_9_0)
    @AltName("PROT_ENTITY_TYPE_MP_LEVEL")
    PROT_ENTITY_MP_LEVEL,
    @AddedIn(VERSION.V1_1_0)
    @AltName("PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY")
    PROT_ENTITY_PLAY_TEAM_ENTITY,
    @AddedIn(VERSION.V1_2_0)
    @AltName("PROT_ENTITY_TYPE_EYE_POINT")
    PROT_ENTITY_EYE_POINT,
    @AddedIn(VERSION.VCB2)
    @AltName("PROT_ENTITY_TYPE_MAX")
    PROT_ENTITY_MAX,
}