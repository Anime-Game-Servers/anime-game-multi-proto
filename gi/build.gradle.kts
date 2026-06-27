plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

group = "org.anime_game_servers.multi_proto"
version = libs.versions.anime.game.multi.proto.get()

ksp {
    arg("basePacket", "org.anime_game_servers.multi_proto.gi")
}

kotlin {
    jvmToolchain(libs.versions.jvmVersion.get().toInt())
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    mingwX64()
    linuxX64()
    linuxArm64()

    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":base"))
                api(project(":gi-models"))
                api(project(":gi-packet-ids"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifactId = "gi-multi-proto"
        }
    }
}
