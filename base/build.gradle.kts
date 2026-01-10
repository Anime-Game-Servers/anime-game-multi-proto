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
    js(IR) {
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
            dependencies{
                api(libs.bundles.common.ags.base)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            getTasksByName("jvmJar", true).forEach{
                it.setProperty("zip64", true)
            }
        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifactId = "base"
        }
    }
}
