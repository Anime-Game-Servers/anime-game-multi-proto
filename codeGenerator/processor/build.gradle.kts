plugins {
    kotlin("multiplatform")
}
group = "org.anime_game_servers.multi_proto"
version = libs.versions.anime.game.multi.proto.get()
kotlin {
    jvmToolchain(17)
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":base"))
                implementation(libs.bundles.ksp.processor)
                api(libs.bundles.common.ags.base)
            }
        }
        val jvmTest by getting
    }
}
