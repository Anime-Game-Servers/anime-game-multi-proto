import messages.SummerTimeV2BoatStageInfoTest
import messages.VERSION
import protos.V3_2.ActivityInfo

class test {
    fun test(){
        val tsetst: SummerTimeV2BoatStageInfoTest = SummerTimeV2BoatStageInfoTest()
        tsetst.encodeToByteArray(VERSION.V3_2_0)
        val testActivityInfo = ActivityInfo()
        testActivityInfo.summerTimeInfo
    }
}