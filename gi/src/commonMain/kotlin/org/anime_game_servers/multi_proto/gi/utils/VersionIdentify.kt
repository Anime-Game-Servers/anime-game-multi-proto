package org.anime_game_servers.multi_proto.gi.utils

import org.anime_game_servers.core.base.Game
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.gi.data.other.PingReq
import org.anime_game_servers.multi_proto.gi.data.player.GetPlayerTokenReq
import org.anime_game_servers.multi_proto.gi.messages.player.GetPlayerTokenReq as GetPlayerTokenReqPacket
import org.anime_game_servers.multi_proto.gi.messages.player.PlayerLoginReq
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

object VersionIdentify {
    val loginReqRegex = Regex("\\d.\\d.\\d_")
    val regionParamsRegex = Regex("\\d.\\d.\\d")

    /**
     * Gets the potential versions of the client based on the cmdid and data from the first packet send by the client.
     * This will likely be a [GetPlayerTokenReq], but it might be possible that it could also contain a [PingReq] packet.
     * @param cmdId the cmdid of the first packet
     * @param data the already decrypted proto data of the first packet
     * @return a list of potential versions, or null if the cmdid is unknown
     */
    @JvmStatic
    fun getClientVersionsFromFirstPacket(cmdId: Int, data: ByteArray): List<Version>? {
        val isPingReq = false // todo check if data contains a ping req packet instead of tokenReq
        if (isPingReq) {
            return getVersionsForPingReqCmdId(cmdId, data)
        } else {
            return getVersionsForPlayerTokenReqCmdId(cmdId, data)
        }
    }

    private fun getVersionsForPlayerTokenReqCmdId(cmdId: Int, data: ByteArray): List<Version>? {
        return when(cmdId) {
            101 -> listOf(Version.GI_CB1, Version.GI_CB2, Version.GI_0_9_0, Version.GI_1_0_0,
                Version.GI_1_1_0, Version.GI_1_2_0, Version.GI_1_3_0, Version.GI_1_4_0, Version.GI_1_5_0) //rsp 102
            149 -> listOf(Version.GI_1_6_0, Version.GI_2_0_0, Version.GI_2_1_0, Version.GI_2_2_0) //rsp 118
            160 -> listOf(Version.GI_2_3_0, Version.GI_2_4_0, Version.GI_2_5_0, Version.GI_2_6_0) //rsp 133
            109 -> listOf(Version.GI_2_7_0) //rsp 131
            172 -> {// 2.8-3.2
                val proto = GetPlayerTokenReqPacket.parseBy(data, Version.GI_3_2_0)
                if(proto.keyId == 4 || proto.keyId == 5) { // 3.2 added key id 4 and 5
                    listOf(Version.GI_3_2_0)
                } else if (proto.keyId != 0) {
                    listOf(Version.GI_2_8_0, Version.GI_3_0_0, Version.GI_3_1_0)
                } else {
                    listOf(Version.GI_2_8_0, Version.GI_3_0_0, Version.GI_3_1_0, Version.GI_3_2_0)
                }
            } //rsp 198
            179 -> listOf(Version.GI_3_3_0) //rsp 130
            105 -> listOf(Version.GI_3_4_0) //rsp 155
            167 -> listOf(Version.GI_3_5_0) //rsp 167
            190 -> listOf(Version.GI_3_6_0) //rsp 196
            175 -> listOf(Version.GI_3_7_0) //rsp 196
            6929 -> listOf(Version.GI_3_8_0) //rsp 7187
            21228 -> listOf(Version.GI_4_0_0) //rsp 2407
            26778 -> listOf(Version.GI_4_1_0) //rsp 1347
            28214 -> listOf(Version.GI_4_2_0) //rsp 1574
            25045 -> listOf(Version.GI_4_3_0) //rsp 5520
            21218 -> listOf(Version.GI_4_4_0) //rsp 22858
            4241 -> listOf(Version.GI_4_5_0) //rsp 9343
            28960 -> listOf(Version.GI_4_6_0) //rsp 4867
            23703 -> listOf(Version.GI_4_7_0) //rsp 322
            4210 -> listOf(Version.GI_4_8_0) //rsp 6796
            6013 -> listOf(Version.GI_5_0_0) //rsp 24174
            8611 -> listOf(Version.GI_5_1_0) //rsp 23639
            8726 -> listOf(Version.GI_5_2_0) //rsp 87
            29463 -> listOf(Version.GI_5_3_0) //rsp 24838
            29676 -> listOf(Version.GI_5_4_0) //rsp 894
            29482 -> listOf(Version.GI_5_5_0) //rsp 28793
            22680 -> listOf(Version.GI_5_6_0) //rsp 367
            23191 -> listOf(Version.GI_5_7_0) //rsp 7156
            else -> return null
        }
    }

    private fun getVersionsForPingReqCmdId(cmdId: Int, data: ByteArray): List<Version>? {
        return when(cmdId) {
            5 -> listOf(Version.GI_CB1, Version.GI_CB2, Version.GI_0_9_0, Version.GI_1_0_0,
                Version.GI_1_1_0, Version.GI_1_2_0, Version.GI_1_3_0, Version.GI_1_4_0, Version.GI_1_5_0) //rsp 6
            100 -> {
                //TODO do actual content checking
                /*
                    check for ue_time field id existence and wiretype 5 (float)
                    1.6-2.2 fieldId: 4
                    3.3 fieldId: 2
                 */
                listOf(Version.GI_1_6_0, Version.GI_2_0_0, Version.GI_2_1_0, Version.GI_2_2_0) //rsp 1
                //listOf(Version.GI_3_3_0) //rsp 43
            }
            37 -> listOf(Version.GI_2_3_0, Version.GI_2_4_0, Version.GI_2_5_0, Version.GI_2_6_0) //rsp 93
            32 -> listOf(Version.GI_2_7_0) //rsp 17
            7 -> {
                listOf(Version.GI_2_8_0, Version.GI_3_0_0, Version.GI_3_1_0, Version.GI_3_2_0) //rsp 21
            }
            20 -> listOf(Version.GI_3_4_0) //rsp 74
            14 -> listOf(Version.GI_3_5_0) //rsp 34
            16 -> listOf(Version.GI_3_6_0) //rsp 56
            55 -> listOf(Version.GI_3_7_0) //rsp 48
            999999 -> listOf(Version.GI_3_8_0) //TODO find cmdid //rsp
            5358 -> listOf(Version.GI_4_0_0) //rsp 8231
            999998 -> listOf(Version.GI_4_1_0) //TODO find cmdid //rsp
            999997 -> listOf(Version.GI_4_2_0) //TODO find cmdid //rsp
            999996 -> listOf(Version.GI_4_3_0) //TODO find cmdid //rsp
            999995 -> listOf(Version.GI_4_4_0) //TODO find cmdid //rsp
            999994 -> listOf(Version.GI_4_5_0) //TODO find cmdid //rsp
            26105 -> listOf(Version.GI_4_6_0) //rsp 28294
            28999 -> listOf(Version.GI_4_7_0) //rsp 4322
            999993 -> listOf(Version.GI_4_8_0) //TODO find cmdid //rsp 6796
            5983 -> listOf(Version.GI_5_0_0) //rsp 22595
            6255 -> listOf(Version.GI_5_1_0) //rsp 21110
            8341 -> listOf(Version.GI_5_2_0) //rsp 25458
            22759 -> listOf(Version.GI_5_3_0) //rsp 8719
            26500 -> listOf(Version.GI_5_4_0) //rsp 5514
            9587 -> listOf(Version.GI_5_5_0) //rsp 21573
            5801 -> listOf(Version.GI_5_6_0) //rsp 29110
            //9156 -> listOf(Version.GI_5_7_0) //rsp 8127
            else -> return null
        }
    }

    /**
     *
     * @return Result with the version if parsing was successful and the version is known, null if the version is unknown, or an exception if an error occurred while parsing the version.
     */
    private fun getVersionWithRegex(regex: Regex, clientVersion: String): Result<Version>? {
        try {
            regex.find(clientVersion)?.let {
                val version = it.value.split(Regex("[._]"))
                val versionMajor: Int = version[0].toInt()
                val versionMinor: Int = version[1].toInt()
                val versionFix: Int = version[2].toInt()
                val versionId = Version.idFromVersion(Game.GI, versionMajor, versionMinor, versionFix)
                return Version.fromId(Game.GI, versionId)?.let { versionResult ->
                    Result.success(versionResult)
                }
            } ?: return Result.failure(IllegalArgumentException("Unable to extract version from client version string: $clientVersion"))
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }

    /**
     * Gets the client version from the [PlayerLoginReq] packet, which contains a client version string, allowing for a more accurate version identification.
     * throws an exception if an error occurred while extracting
     * @param packet the already parsed [PlayerLoginReq] packet to extract the version from
     * @return the version if parsing was successful and the version is known, null if the version is unknown
     */
    @JvmStatic @JvmName("getClientVersionFromPlayerLoginReq")
    fun getClientVersionFromPlayerLoginReqJava(packet: PlayerLoginReq): Version? {
        return getClientVersionFromPlayerLoginReq(packet)?.onFailure {
            throw it
        }?.getOrNull()
    }


    /**
     * Gets the client version from the [PlayerLoginReq] packet, which contains a client version string, allowing for a more accurate version identification.
     * @param packet the already parsed [PlayerLoginReq] packet to extract the version from
     * @return Result with the version if parsing was successful and the version is known, null if the version is unknown, or an exception if an error occurred while parsing the version.
     */
    @Suppress("MemberVisibilityCanBePrivate")
    fun getClientVersionFromPlayerLoginReq(packet: PlayerLoginReq): Result<Version>? {
        val clientVersion = packet.clientVersion
        if(clientVersion.isBlank()) {
            return Result.failure(IllegalArgumentException("Client version is blank"))
        }
        return getVersionWithRegex(loginReqRegex, clientVersion)
    }


    /**
     * Gets the client version from the `version` query param in /query_cur_region/{region}.
     * throws an exception if an error occurred while extracting
     * @param versionQueryString the version query string to extract the version from
     * @return the version if parsing was successful and the version is known, null if the version is unknown
     */
    @JvmStatic @JvmName("getClientVersionFromQueryRegion")
    fun getClientVersionFromQueryRegionJava(versionQueryString: String): Version? {
        return getClientVersionFromQueryRegion(versionQueryString)?.onFailure {
            throw it
        }?.getOrNull()
    }

    /**
     * Gets the client version from the `version` query param in /query_cur_region/{region}.
     * @param versionQueryString the version query string to extract the version from
     * @return Result with the version if parsing was successful and the version is known, null if the version is unknown, or an exception if an error occurred while parsing the version.
     */
    @Suppress("MemberVisibilityCanBePrivate")
    fun getClientVersionFromQueryRegion(versionQueryString: String) : Result<Version>? {
        if(versionQueryString.isBlank()) {
            return Result.failure(IllegalArgumentException("Version is blank"))
        }
        return getVersionWithRegex(regionParamsRegex, versionQueryString)
    }
}
