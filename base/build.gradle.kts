plugins {
    kotlin("multiplatform")
}

group = "org.anime_game_servers.multi_proto"
version = "0.2"

kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
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
    // mingwX64() not supported by pbandk-runtime 0.14.2
    linuxX64()
    linuxArm64()

    
    sourceSets {
        val commonMain by getting {
            dependencies{
                implementation("org.anime_game_servers.core:gi:0.2")
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
