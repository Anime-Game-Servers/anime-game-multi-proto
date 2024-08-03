plugins {
    kotlin("multiplatform")
}
group = "org.anime_game_servers.multi_proto"
version = "0.1"
kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation("com.google.devtools.ksp:symbol-processing-api:1.9.24-1.0.20")
                implementation(project(":core"))
            }
        }
        val jvmTest by getting
    }
}
