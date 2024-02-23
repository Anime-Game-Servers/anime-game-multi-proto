package data.battle

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.proto.AltName

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ForwardType {
    @AltName("FORWARD_TYPE_LOCAL")
    FORWARD_LOCAL,
    @AltName("FORWARD_TYPE_TO_ALL")
    FORWARD_TO_ALL,
    @AltName("FORWARD_TYPE_TO_ALL_EXCEPT_CUR")
    FORWARD_TO_ALL_EXCEPT_CUR,
    @AltName("FORWARD_TYPE_TO_HOST")
    FORWARD_TO_HOST,
    @AltName("FORWARD_TYPE_TO_ALL_GUEST")
    FORWARD_TO_ALL_GUEST,
    @AltName("FORWARD_TYPE_TO_PEER")
    FORWARD_TO_PEER,
    @AltName("FORWARD_TYPE_TO_PEERS")
    FORWARD_TO_PEERS,
    @AltName("FORWARD_TYPE_ONLY_SERVER")
    FORWARD_ONLY_SERVER,
    @AltName("FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR")
    FORWARD_TO_ALL_EXIST_EXCEPT_CUR,
}