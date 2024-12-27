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
                implementation("com.google.devtools.ksp:symbol-processing-api:2.1.0-1.0.29")
                implementation(project(":base"))
                implementation("org.anime_game_servers.core:base:0.1")
            }
        }
        val jvmTest by getting
    }
}
