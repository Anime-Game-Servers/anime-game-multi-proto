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
        nodejs()
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
    macosArm64()
    iosArm64()
    iosX64()

    
    sourceSets {
        commonMain {
            dependencies {
                api(project(":base"))
                api(project(":gi-models"))
                api(project(":gi-packet-ids"))
            }
        }
        commonTest {
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
