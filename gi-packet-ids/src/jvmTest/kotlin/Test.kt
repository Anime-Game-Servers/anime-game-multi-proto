import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.gi.messages.activity.summer_time_v2.SummerTimeV2DungeonStageInfo
import org.anime_game_servers.multi_proto.gi.messages.general.PropValue
import org.anime_game_servers.multi_proto.gi.messages.player.PlayerDataNotify
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class EncodeDecodeTests {
    val testVersion = Version.GI_3_2_0
    @Test
    fun testSimple(){
        var stateIdVar = 2
        var openTimeVar = 3
        var isOpenVar = true
        var isPrevDungeonSucceedVar = true

        val testProto = SummerTimeV2DungeonStageInfo().apply {
            stageId = stateIdVar
            isOpen = isOpenVar
            openTime = openTimeVar
            isPrevDungeonSucceed = isPrevDungeonSucceedVar
        }
        val encoded = testProto.encodeToByteArray(testVersion)
        assertNotNull(encoded)
        val testDecode = SummerTimeV2DungeonStageInfo.parseBy(encoded, testVersion)
        assertEquals(stateIdVar, testDecode.stageId)
        assertEquals(isOpenVar, testDecode.isOpen)
        assertEquals(openTimeVar, testDecode.openTime)
        assertEquals(isPrevDungeonSucceedVar, testDecode.isPrevDungeonSucceed)
    }

    @Test
    fun testLists(){
        TODO()
    }


    @Test
    fun testChained(){
        TODO()
    }

    private fun PropValue.isSame(propValue: PropValue, propValue1: PropValue) {
        assertEquals(propValue.`val`, propValue1.`val`)
        assertEquals(propValue.value?.javaClass, propValue1.value?.javaClass)
        assertEquals(propValue.value?.value, propValue1.value?.value)
    }

    @Test
    fun testMap(){
        var nickNameVar = "nickTest"
        var serverTimeVar = 2L
        var isFirstLoginTodayVar = true
        var regionIdVar = 3
        var childMap = mapOf(
            2 to PropValue().apply {
                `val` = 3
                value = PropValue.Value.Ival(6)
            },
            4 to PropValue().apply { `val` = 5
                                   value = PropValue.Value.Fval(10.0f)
            },
            8 to PropValue().apply { `val` = 7 },
        )

        val testProto = PlayerDataNotify().apply {
            nickName = nickNameVar
            propMap = childMap
            serverTime = serverTimeVar
            isFirstLoginToday = isFirstLoginTodayVar
            regionId = regionIdVar
        }
        val encoded = testProto.encodeToByteArray(testVersion)
        assertNotNull(encoded)
        val testDecode = PlayerDataNotify.parseBy(encoded, testVersion)
        assertEquals(nickNameVar, testDecode.nickName)
        assertEquals(serverTimeVar, testDecode.serverTime)
        assertEquals(isFirstLoginTodayVar, testDecode.isFirstLoginToday)
        assertEquals(regionIdVar, testDecode.regionId)
        assertEquals(childMap.size, testDecode.propMap.size)
        childMap.forEach { (key, value) ->
            val propValue = testDecode.propMap[key]
            assertNotNull(propValue)
            testDecode.propMap[key]?.isSame(value, propValue)
        }
    }
}
