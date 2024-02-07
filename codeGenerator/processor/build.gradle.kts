plugins {
    kotlin("multiplatform")
}
group = "org.anime_game_servers.multi_proto"
version = "0.1"
kotlin {
    jvm {
        jvmToolchain(17)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation("com.google.devtools.ksp:symbol-processing-api:1.9.21-1.0.16")
            }
        }
        val jvmTest by getting
    }
}
