plugins {
    kotlin("multiplatform")
}

group = "org.anime_game_servers.multi_proto"
version = libs.versions.anime.game.multi.proto.get()

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }
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
            dependencies{
                api(libs.bundles.common.ags.base)
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
            artifactId = "base"
        }
    }
}
