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
                implementation(project(":base"))
                implementation(project(":processor-common"))
                implementation("com.google.devtools.ksp:symbol-processing-api:2.1.20-2.0.0")
                implementation("org.anime_game_servers.core:base:0.2")
            }
        }
        val jvmTest by getting
    }
}
